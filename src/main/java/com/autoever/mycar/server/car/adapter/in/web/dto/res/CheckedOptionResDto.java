package com.autoever.mycar.server.car.adapter.in.web.dto.res;

import com.autoever.mycar.server.car.domain.code.OptionCode;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import lombok.Getter;

@Getter
public class CheckedOptionResDto {

    @Schema(description = "available 이 true 이면 추가되는 옵션이 존재")
    private Boolean available;
    @Schema(description = "선택되어야 하는 옵션 코드 목록")
    private List<OptionCode> optionCode;

    public CheckedOptionResDto(Boolean available, List<OptionCode> optionCode) {
        this.available = available;
        this.optionCode = optionCode;
    }
}
