package com.autoever.mycar.server.domain.car.service;

import com.autoever.mycar.server.domain.car.data.CarRepository;
import com.autoever.mycar.server.domain.car.dto.req.ModelFilterReqDto;
import com.autoever.mycar.server.domain.car.dto.res.ToolTipListDto;
import com.autoever.mycar.server.domain.car.view.CarResDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {
    private final CarRepository carRepository;

    public List<CarResDto> getCarList() {
        return carRepository.findAllByCarInfo();
    }

    @Transactional(readOnly = true)
    public ToolTipListDto getModelFilter(ModelFilterReqDto reqDto) {

    }
}
