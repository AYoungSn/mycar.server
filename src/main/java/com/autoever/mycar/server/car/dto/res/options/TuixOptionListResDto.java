package com.autoever.mycar.server.car.dto.res.options;

import com.autoever.mycar.server.car.domain.Options;
import com.autoever.mycar.server.car.domain.type.OptionCategory;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class TuixOptionListResDto {
    private List<OptionInfoResDto> hga;
    private List<OptionInfoResDto> npf;

    public TuixOptionListResDto(List<Options> tuix) {
        hga = new ArrayList<>();
        npf = new ArrayList<>();
        for (Options options: tuix) {
            if (options.getCategory().equals(OptionCategory.HGA)) {
                hga.add(new OptionInfoResDto(options));
            } else if (options.getCategory().equals(OptionCategory.NPF)) {
                npf.add(new OptionInfoResDto(options));
            }
        }
    }
}
