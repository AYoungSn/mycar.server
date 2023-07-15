package com.autoever.mycar.server.car.adapter.out.view;

import com.autoever.mycar.server.car.domain.code.CarCode;
import com.autoever.mycar.server.car.domain.code.TrimCode;
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
