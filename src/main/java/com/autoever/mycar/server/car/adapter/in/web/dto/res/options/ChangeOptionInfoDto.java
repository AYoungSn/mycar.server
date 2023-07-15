package com.autoever.mycar.server.car.adapter.in.web.dto.res.options;

import com.autoever.mycar.server.car.domain.Options;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;

@Getter
public class ChangeOptionInfoDto {

    private List<OptionInfoResDto> delOptions;
    private List<OptionInfoResDto> addOptions;

    public ChangeOptionInfoDto(List<Options> delOptions, List<Options> addOptions) {
        this.delOptions = delOptions.stream().map(OptionInfoResDto::new)
                .collect(Collectors.toList());
        this.addOptions = addOptions.stream().map(OptionInfoResDto::new)
                .collect(Collectors.toList());
    }
}
