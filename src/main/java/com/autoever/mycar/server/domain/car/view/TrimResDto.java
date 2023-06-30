package com.autoever.mycar.server.domain.car.view;

import java.math.BigDecimal;

public interface TrimResDto {
    Long getModelId();
    String getTrimName();
    BigDecimal getPrice();
    String getBasicInfo();
}
