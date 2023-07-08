package com.autoever.mycar.server.domain.car.application.service;

import com.autoever.mycar.server.domain.car.adapter.out.persistence.CarRepository;
import com.autoever.mycar.server.domain.car.adapter.out.persistence.ModelRepository;
import com.autoever.mycar.server.domain.car.adapter.out.persistence.options.OptionsRepository;
import com.autoever.mycar.server.domain.car.adapter.out.persistence.color.ExteriorRepository;
import com.autoever.mycar.server.domain.car.adapter.out.persistence.color.InteriorRepository;
import com.autoever.mycar.server.domain.car.dto.req.ModelFilterReqDto;
import com.autoever.mycar.server.domain.car.dto.res.ModelDetailResDto;
import com.autoever.mycar.server.domain.car.dto.view.ModelResDto;
import com.autoever.mycar.server.domain.car.dto.res.ToolTipListDto;
import com.autoever.mycar.server.domain.car.dto.view.ExteriorDto;
import com.autoever.mycar.server.domain.car.dto.view.InteriorDto;
import com.autoever.mycar.server.domain.car.exception.ModelNotFoundException;
import com.autoever.mycar.server.domain.car.dto.view.CarResDto;
import com.autoever.mycar.server.domain.car.adapter.out.persistence.ToolTipsRepository;
import com.autoever.mycar.server.domain.car.dto.view.TrimResDto;
import com.autoever.mycar.server.domain.car.entity.Options;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
        ToolTipListDto result = new ToolTipListDto(toolTipsRepository.findAllToolTips(reqDto.getCarCode().name()));
        if (reqDto.getEngineId() != null) {
            result.setGearbox(toolTipsRepository.findAllEnableToolTips(reqDto.getCarCode().name(), reqDto.getEngineId()));
        }
        return result;
    }

    @Transactional(readOnly = true)
    public List<TrimResDto> findModelsByToolTips(ModelFilterReqDto reqDto) {
        if (reqDto.getDrivingId() == null || reqDto.getGearboxId() == null)
            return modelRepository.findAllByCarIdAndTooltipId(reqDto.getCarCode().name(), reqDto.getEngineId());
        return modelRepository.findAllByCarIdAndTooltipId(reqDto.getCarCode().name(), reqDto.getEngineId(), reqDto.getGearboxId(), reqDto.getDrivingId());
    }

    public ModelDetailResDto myCarInit(Long modelId) {
        ModelResDto modelResDto = modelRepository.findByModelId(modelId)
                .orElseThrow(ModelNotFoundException::new);
        // car 종류별로 선택 가능한 외장, 내장 색상 가져오기
        List<ExteriorDto> exteriors = exteriorRepository.findAllByCarCode(modelResDto.getCarCode().name());
        List<InteriorDto> interiors = interiorRepository.findAllByCarCode(modelResDto.getCarCode().name());
        List<Options> options = optionsRepository.findAllByModelId(modelId);
        ModelDetailResDto result = new ModelDetailResDto(modelResDto, exteriors, interiors, options);
        result.optionsChoiceCheck(optionsRepository.findAllDependencyOption(modelResDto.getTrimCode().name()));
        result.exteriorChoiceCheck(exteriorRepository.findAllByTrimCode(modelResDto.getTrimCode().name()));
        result.interiorChoiceCheck(interiorRepository.findAllByTrimCode(modelResDto.getTrimCode().name()));
        return result;
    }
}
