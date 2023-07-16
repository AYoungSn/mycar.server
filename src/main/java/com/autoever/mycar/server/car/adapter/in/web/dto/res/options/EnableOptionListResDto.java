package com.autoever.mycar.server.car.adapter.in.web.dto.res.options;

import com.autoever.mycar.server.car.domain.Options;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;

@Getter
public class EnableOptionListResDto {

    @Schema(description = "추가되어야 하는 옵션 목록")
    private List<OptionInfoResDto> addOptions;

    public EnableOptionListResDto(List<Options> addOptions) {
        this.addOptions = addOptions.stream().map(OptionInfoResDto::new)
                .collect(Collectors.toList());
    }
}
