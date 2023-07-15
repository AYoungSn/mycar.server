package com.autoever.mycar.server.car.adapter.in.web.dto.res;

import com.autoever.mycar.server.car.domain.code.OptionCode;
import java.util.List;
import lombok.Getter;

@Getter
public class CheckedOptionResDto {

    private Boolean available;
    private List<OptionCode> optionCode;

    public CheckedOptionResDto(Boolean available, List<OptionCode> optionCode) {
        this.available = available;
        this.optionCode = optionCode;
    }
}
