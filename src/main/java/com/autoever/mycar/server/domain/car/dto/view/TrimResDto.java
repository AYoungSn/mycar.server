package com.autoever.mycar.server.domain.car.dto.view;

import com.autoever.mycar.server.domain.car.entity.code.CarCode;
import com.autoever.mycar.server.domain.car.entity.code.TrimCode;

import java.math.BigDecimal;

public interface TrimResDto {
    Long getModelId();
    String getTrimName();
    BigDecimal getPrice();
    String getBasicInfo();
    TrimCode getTrimCode();
    CarCode getCarCode();
}
