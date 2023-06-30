package com.autoever.mycar.server.domain.car.service;

import com.autoever.mycar.server.domain.car.data.CarRepository;
import com.autoever.mycar.server.domain.car.data.ModelRepository;
import com.autoever.mycar.server.domain.car.dto.req.ModelFilterReqDto;
import com.autoever.mycar.server.domain.car.dto.res.ToolTipListDto;
import com.autoever.mycar.server.domain.car.view.CarResDto;
import com.autoever.mycar.server.domain.car.data.ToolTipsRepository;
import com.autoever.mycar.server.domain.car.view.TrimResDto;
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
}
