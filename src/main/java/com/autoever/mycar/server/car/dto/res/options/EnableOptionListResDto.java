package com.autoever.mycar.server.car.dto.res.options;

import com.autoever.mycar.server.car.domain.Options;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class EnableOptionListResDto {
    private List<OptionInfoResDto> addOptions;

    public EnableOptionListResDto(List<Options> addOptions) {
        this.addOptions = addOptions.stream().map(OptionInfoResDto::new).collect(Collectors.toList());
    }
}
