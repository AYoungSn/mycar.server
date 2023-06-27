package com.autoever.mycar.server.domain.car.view;

import com.autoever.mycar.server.domain.entity.type.CarType;

public interface CarResDto {
    Long getCarId();
    CarType getCarType();
    String getCarName();
    Long getPrice();
}
