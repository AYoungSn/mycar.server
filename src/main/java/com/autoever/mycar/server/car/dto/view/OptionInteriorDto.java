package com.autoever.mycar.server.car.dto.view;

import com.autoever.mycar.server.car.domain.code.InteriorCode;
import com.autoever.mycar.server.car.domain.code.OptionCode;

public interface OptionInteriorDto {
    OptionCode getOptionCode();
    InteriorCode getInteriorCode();
}
