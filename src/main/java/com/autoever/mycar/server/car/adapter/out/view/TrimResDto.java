package com.autoever.mycar.server.car.adapter.out.view;

import com.autoever.mycar.server.car.domain.code.CarCode;
import com.autoever.mycar.server.car.domain.code.TrimCode;
import java.math.BigDecimal;

public interface TrimResDto {

    Long getModelId();

    String getTrimName();

    BigDecimal getPrice();

    String getBasicInfo();

    TrimCode getTrimCode();

    CarCode getCarCode();
}
