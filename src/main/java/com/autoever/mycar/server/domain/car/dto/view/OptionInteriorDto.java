package com.autoever.mycar.server.domain.car.dto.view;

import com.autoever.mycar.server.domain.car.entity.code.InteriorCode;
import com.autoever.mycar.server.domain.car.entity.code.OptionCode;

public interface OptionInteriorDto {
    OptionCode getOptionCode();
    InteriorCode getInteriorCode();
}
