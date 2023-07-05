package com.autoever.mycar.server.domain.car.dto.view;

import com.autoever.mycar.server.domain.car.entity.code.ExteriorCode;

import java.math.BigDecimal;

public interface ExteriorDto {
    Long getId();
    ExteriorCode getCode();
    String getName();
    String getImgUri();
    BigDecimal getPrice();
}
