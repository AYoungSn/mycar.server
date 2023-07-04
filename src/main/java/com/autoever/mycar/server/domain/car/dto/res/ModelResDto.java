package com.autoever.mycar.server.domain.car.dto.res;

import java.math.BigDecimal;

public interface ModelResDto {
    Long getModelId();
    String getModelName();
    Long getCarId();
    String getCarName();
    Long getTrimId();
    String getTrimName();
    BigDecimal getPrice();
}
