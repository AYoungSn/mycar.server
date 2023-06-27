package com.autoever.mycar.server.domain.car.service;

import com.autoever.mycar.server.domain.car.data.CarRepository;
import com.autoever.mycar.server.domain.car.view.CarResDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {
    private final CarRepository carRepository;

    public List<CarResDto> getCarList() {
        return carRepository.findAllByCarInfo();
    }
}
