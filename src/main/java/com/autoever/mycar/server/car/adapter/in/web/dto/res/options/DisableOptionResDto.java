package com.autoever.mycar.server.car.adapter.in.web.dto.res.options;

import com.autoever.mycar.server.car.domain.Options;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;

@Getter
public class DisableOptionResDto {

    private List<OptionInfoResDto> delOptions;

    public DisableOptionResDto(List<Options> delOptions) {
        this.delOptions = delOptions.stream().map(OptionInfoResDto::new)
                .collect(Collectors.toList());
    }
}
