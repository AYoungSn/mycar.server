package com.autoever.mycar.server.car.application.service;

import com.autoever.mycar.server.car.adapter.in.web.dto.req.ModelFilterReqDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.res.ModelBasicInfoListDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.res.ModelDetailResDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.res.ToolTipListDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.res.TrimListResDto;
import com.autoever.mycar.server.car.adapter.out.persistence.CarRepository;
import com.autoever.mycar.server.car.adapter.out.persistence.ModelRepository;
import com.autoever.mycar.server.car.adapter.out.persistence.ToolTipsRepository;
import com.autoever.mycar.server.car.adapter.out.persistence.color.ExteriorRepository;
import com.autoever.mycar.server.car.adapter.out.persistence.color.InteriorRepository;
import com.autoever.mycar.server.car.adapter.out.persistence.options.OptionsRepository;
import com.autoever.mycar.server.car.adapter.out.view.CarResDto;
import com.autoever.mycar.server.car.adapter.out.view.ModelResDto;
import com.autoever.mycar.server.car.adapter.out.view.TrimResDto;
import com.autoever.mycar.server.car.domain.Options;
import com.autoever.mycar.server.car.domain.code.CarCode;
import com.autoever.mycar.server.car.domain.color.Exterior;
import com.autoever.mycar.server.car.domain.color.Interior;
import com.autoever.mycar.server.car.exception.ModelNotFoundException;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;
    private final ToolTipsRepository toolTipsRepository;
    private final ModelRepository modelRepository;
    private final InteriorRepository interiorRepository;
    private final ExteriorRepository exteriorRepository;
    private final OptionsRepository optionsRepository;

    public List<CarResDto> getCarList() {
        return carRepository.findAllByCarInfo();
    }

    @Transactional(readOnly = true)
    public ToolTipListDto findToolTips(ModelFilterReqDto reqDto) {
        // engine 선택 안된 경우
        ToolTipListDto result = new ToolTipListDto(
                toolTipsRepository.findAllToolTips(reqDto.getCarCode().name()));
        if (reqDto.getEngineId() != null) {
            result.setGearbox(toolTipsRepository.findAllEnableToolTips(reqDto.getCarCode().name(),
                    reqDto.getEngineId()));
        }
        return result;
    }

    @Transactional(readOnly = true)
    public List<TrimResDto> findModelsByToolTips(ModelFilterReqDto reqDto) {
        if (reqDto.getDrivingId() == null || reqDto.getGearboxId() == null) {
            return modelRepository.findAllByCarIdAndTooltipId(reqDto.getCarCode().name(),
                    reqDto.getEngineId());
        }
        return modelRepository.findAllByCarIdAndTooltipId(reqDto.getCarCode().name(),
                reqDto.getEngineId(), reqDto.getGearboxId(), reqDto.getDrivingId());
    }

    public ModelDetailResDto myCarInit(Long modelId) {
        ModelResDto modelResDto = modelRepository.findByModelId(modelId)
                .orElseThrow(ModelNotFoundException::new);
        // car 종류별로 선택 가능한 외장, 내장 색상 가져오기
        List<Exterior> exteriors = exteriorRepository.findAllByCarCode(modelResDto.getCarCode());
        List<Interior> interiors = interiorRepository.findAllByCarCode(modelResDto.getCarCode());
        List<Options> options = optionsRepository.findAllByModelId(modelId);
        ModelDetailResDto result = new ModelDetailResDto(
                modelResDto, exteriors, interiors, options);
        result.optionsChoiceCheck(
                optionsRepository.findAllDependencyOption(modelResDto.getTrimCode()));
        result.exteriorChoiceCheck(
                exteriorRepository.findAllByTrimCode(modelResDto.getTrimCode()));
        result.interiorChoiceCheck(
                interiorRepository.findAllByTrimCode(modelResDto.getTrimCode()));
        return result;
    }

    public ModelBasicInfoListDto findModelBasicInfo(CarCode carCode) {
        return new ModelBasicInfoListDto(
                modelRepository.findDistinctModelNameByCarCode(carCode.name()));
    }

    public TrimListResDto findTrimListAndModelName(CarCode carCode, String modelBasicName) {
        return new TrimListResDto(
                modelRepository.findAllByCarCodeAndModelBasicInfo(carCode.name(), modelBasicName));
    }
}
