package com.autoever.mycar.server.car.adapter.in.web.dto.res.options;

import com.autoever.mycar.server.car.domain.Options;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;

@Getter
public class DisableOptionResDto {

    @Schema(description = "선택 불가능한 옵션 목록")
    private List<OptionInfoResDto> delOptions;

    public DisableOptionResDto(List<Options> delOptions) {
        this.delOptions = delOptions.stream().map(OptionInfoResDto::new)
                .collect(Collectors.toList());
    }
}
