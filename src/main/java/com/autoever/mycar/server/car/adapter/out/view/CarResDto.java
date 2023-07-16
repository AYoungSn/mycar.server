package com.autoever.mycar.server.car.adapter.out.view;

import com.autoever.mycar.server.car.domain.code.CarCode;
import com.autoever.mycar.server.car.domain.type.CarType;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "자동차 종류 리스트")
public interface CarResDto {

    Long getCarId();

    CarType getCarType();

    String getCarName();

    Long getPrice();

    CarCode getCarCode();
}
