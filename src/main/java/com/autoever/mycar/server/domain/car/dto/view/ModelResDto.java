package com.autoever.mycar.server.domain.car.dto.view;

import com.autoever.mycar.server.domain.car.entity.code.CarCode;
import com.autoever.mycar.server.domain.car.entity.code.TrimCode;

import java.math.BigDecimal;

public interface ModelResDto {
    Long getModelId();
    String getModelName();
    Long getCarId();
    CarCode getCarCode();
    String getCarName();
    Long getTrimId();
    TrimCode getTrimCode();
    String getTrimName();
    BigDecimal getPrice();
}
