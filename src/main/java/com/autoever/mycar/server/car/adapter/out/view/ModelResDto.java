package com.autoever.mycar.server.car.adapter.out.view;

import com.autoever.mycar.server.car.domain.code.CarCode;
import com.autoever.mycar.server.car.domain.code.TrimCode;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;

@Schema(description = "모델에 대한 상세 정보")
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
