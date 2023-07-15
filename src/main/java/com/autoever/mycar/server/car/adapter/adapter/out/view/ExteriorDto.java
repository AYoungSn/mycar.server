package com.autoever.mycar.server.car.adapter.adapter.out.view;

import com.autoever.mycar.server.car.domain.code.ExteriorCode;
import java.math.BigDecimal;

public interface ExteriorDto {

    Long getId();

    ExteriorCode getCode();

    String getName();

    String getImgUri();

    BigDecimal getPrice();
}
