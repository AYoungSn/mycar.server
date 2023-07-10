package com.autoever.mycar.server.car.dto.res;

import com.autoever.mycar.server.car.domain.code.OptionCode;
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
