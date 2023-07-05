package com.autoever.mycar.server.domain.car.dto.view;

import com.autoever.mycar.server.domain.car.entity.code.CarCode;
import com.autoever.mycar.server.domain.car.entity.type.CarType;

public interface CarResDto {
    Long getCarId();
    CarType getCarType();
    String getCarName();
    Long getPrice();
    CarCode getCode();
}
