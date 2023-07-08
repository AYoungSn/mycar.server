package com.autoever.mycar.server.domain.car.dto.res.options;

import com.autoever.mycar.server.domain.car.entity.Options;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class ChangeOptionInfoDto {
    private List<OptionInfoResDto> delOptions;
    private List<OptionInfoResDto> addOptions;

    public ChangeOptionInfoDto(List<Options> delOptions, List<Options> addOptions) {
        this.delOptions = delOptions.stream().map(OptionInfoResDto::new).collect(Collectors.toList());
        this.addOptions = addOptions.stream().map(OptionInfoResDto::new).collect(Collectors.toList());
    }
}
