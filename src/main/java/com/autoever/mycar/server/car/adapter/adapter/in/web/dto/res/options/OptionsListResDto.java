package com.autoever.mycar.server.car.adapter.adapter.in.web.dto.res.options;

import com.autoever.mycar.server.car.domain.Options;
import com.autoever.mycar.server.car.domain.type.OptionCategory;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;

@Getter
public class OptionsListResDto {

    private List<OptionsResDto> hga;
    private List<OptionsResDto> detail;
    private List<OptionsResDto> npf;

    public OptionsListResDto(List<Options> optionsResDtoList) {
        hga = new ArrayList<>();
        detail = new ArrayList<>();
        npf = new ArrayList<>();
        for (Options options : optionsResDtoList) {
            if (options.getCategory().equals(OptionCategory.HGA)) {
                hga.add(new OptionsResDto(options));
            } else if (options.getCategory().equals(OptionCategory.DETAIL)) {
                detail.add(new OptionsResDto(options));
            } else if (options.getCategory().equals(OptionCategory.NPF)) {
                npf.add(new OptionsResDto(options));
            }
        }
    }

    public void optionsChoiceCheck(List<Options> checks) {
        for (Options options : checks) {
            if (options.getCategory().equals(OptionCategory.HGA)) {
                hga = optionUpdate(hga, options);
            } else if (options.getCategory().equals(OptionCategory.DETAIL)) {
                detail = optionUpdate(detail, options);
            } else if (options.getCategory().equals(OptionCategory.NPF)) {
                npf = optionUpdate(npf, options);
            }
        }
    }

    private List<OptionsResDto> optionUpdate(List<OptionsResDto> options, Options check) {
        return options.stream().map(o -> {
            if (check.getCode().equals(o.getCode())) {
                o.setChoiceYn(false);
            }
            return o;
        }).collect(Collectors.toList());
    }
}
