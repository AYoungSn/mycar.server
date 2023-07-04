package com.autoever.mycar.server.domain.car.dto.res.options;

import java.math.BigDecimal;

public interface ExteriorDto {
    Long getId();
    String getName();
    String getImgUri();
    BigDecimal getPrice();
}
