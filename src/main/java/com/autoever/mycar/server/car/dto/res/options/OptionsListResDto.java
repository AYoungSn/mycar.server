package com.autoever.mycar.server.car.dto.res.options;

import com.autoever.mycar.server.car.domain.Options;
import com.autoever.mycar.server.car.domain.type.OptionCategory;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class OptionsListResDto {
    private List<OptionsResDto> hga;
    private List<OptionsResDto> detail;
    private List<OptionsResDto> npf;

    public OptionsListResDto(List<Options> optionsResDtoList) {
        hga = new ArrayList<>();
        detail = new ArrayList<>();
        npf = new ArrayList<>();
        for (Options options: optionsResDtoList) {
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
        for (Options options: checks) {
            if (options.getCategory().equals(OptionCategory.HGA)) {
                hga = hga.stream().peek(o -> {
                    if (options.getCode().equals(o.getCode()))
                        o.setChoiceYN(false);
                }).collect(Collectors.toList());
            } else if (options.getCategory().equals(OptionCategory.DETAIL)) {
                detail = detail.stream().peek(o -> {
                    if (options.getCode().equals(o.getCode()))
                        o.setChoiceYN(false);
                }).collect(Collectors.toList());
            } else if (options.getCategory().equals(OptionCategory.NPF)) {
                npf = npf.stream().peek(o -> {
                    if (options.getCode().equals(o.getCode()))
                        o.setChoiceYN(false);
                }).collect(Collectors.toList());
            }
        }
    }
}
