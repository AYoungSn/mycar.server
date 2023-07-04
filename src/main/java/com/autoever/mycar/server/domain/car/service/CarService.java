package com.autoever.mycar.server.domain.car.service;

import com.autoever.mycar.server.domain.car.data.CarRepository;
import com.autoever.mycar.server.domain.car.data.ModelRepository;
import com.autoever.mycar.server.domain.car.data.OptionsRepository;
import com.autoever.mycar.server.domain.car.data.color.ExteriorRepository;
import com.autoever.mycar.server.domain.car.data.color.InteriorRepository;
import com.autoever.mycar.server.domain.car.dto.req.ModelFilterReqDto;
import com.autoever.mycar.server.domain.car.dto.res.ModelDetailResDto;
import com.autoever.mycar.server.domain.car.dto.res.ModelResDto;
import com.autoever.mycar.server.domain.car.dto.res.ToolTipListDto;
import com.autoever.mycar.server.domain.car.dto.res.options.ExteriorDto;
import com.autoever.mycar.server.domain.car.dto.res.options.InteriorDto;
import com.autoever.mycar.server.domain.car.exception.ModelNotFoundException;
import com.autoever.mycar.server.domain.car.view.CarResDto;
import com.autoever.mycar.server.domain.car.data.ToolTipsRepository;
import com.autoever.mycar.server.domain.car.view.TrimResDto;
import com.autoever.mycar.server.domain.entity.Options;
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
        ToolTipListDto result = new ToolTipListDto(toolTipsRepository.findAllToolTips(reqDto.getCarId()));
        if (reqDto.getEngineId() != null) {
            result.setGearbox(toolTipsRepository.findAllEnableToolTips(reqDto.getCarId(), reqDto.getEngineId()));
        }
        return result;
    }

    @Transactional(readOnly = true)
    public List<TrimResDto> findModelsByToolTips(ModelFilterReqDto reqDto) {
        if (reqDto.getDrivingId() == null || reqDto.getGearboxId() == null)
            return modelRepository.findAllByCarIdAndTooltipId(reqDto.getCarId(), reqDto.getEngineId());
        return modelRepository.findAllByCarIdAndTooltipId(reqDto.getCarId(), reqDto.getEngineId(), reqDto.getGearboxId(), reqDto.getDrivingId());
    }

    public ModelDetailResDto myCarInit(Long modelId) {
        ModelResDto modelResDto = modelRepository.findByModelId(modelId)
                .orElseThrow(ModelNotFoundException::new);
        // car 종류별로 선택 가능한 외장, 내장 색상 가져오기
        List<ExteriorDto> exteriors = exteriorRepository.findAllByCarId(modelResDto.getCarId());
        List<InteriorDto> interiors = interiorRepository.findAllByCarId(modelResDto.getCarId());
        List<Options> options = optionsRepository.findAllByModelId(modelId);
        ModelDetailResDto result = new ModelDetailResDto(modelResDto, exteriors, interiors, options);
        result.exteriorChoiceCheck(exteriorRepository.findAllByTrimId(modelResDto.getTrimId()));
        result.interiorChoiceCheck(interiorRepository.findAllByTrimId(modelResDto.getTrimId()));
        return result;
    }
}
