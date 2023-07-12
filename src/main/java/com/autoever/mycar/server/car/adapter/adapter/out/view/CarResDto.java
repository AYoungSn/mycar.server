package com.autoever.mycar.server.car.adapter.adapter.out.view;

import com.autoever.mycar.server.car.domain.code.CarCode;
import com.autoever.mycar.server.car.domain.type.CarType;

public interface CarResDto {
    Long getCarId();
    CarType getCarType();
    String getCarName();
    Long getPrice();
    CarCode getCarCode();
}
