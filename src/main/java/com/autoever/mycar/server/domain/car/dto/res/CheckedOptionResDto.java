package com.autoever.mycar.server.domain.car.dto.res;

import com.autoever.mycar.server.domain.car.entity.code.ExteriorCode;
import com.autoever.mycar.server.domain.car.entity.code.InteriorCode;
import com.autoever.mycar.server.domain.car.entity.code.OptionCode;
import lombok.Getter;

import java.util.List;

@Getter
public class CheckedOptionResDto {
    private Boolean available;
    private List<OptionCode> optionCode;

    public CheckedOptionResDto(Boolean available, List<OptionCode> optionCode) {
        this.available = available;
        this.optionCode = optionCode;
    }
}
