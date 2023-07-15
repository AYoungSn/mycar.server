package com.autoever.mycar.server.car.adapter.adapter.in.web.dto.req.options;

import com.autoever.mycar.server.car.domain.code.OptionCode;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TrimChangeReqDto {

    private Long beforeModelId;
    private Long afterModelId;
    private String optionCode;

    @JsonIgnore
    public List<OptionCode> getOptionCodes() {
        if (optionCode == null || optionCode.isEmpty()) {
            return new ArrayList<>();
        }
        return Arrays.stream(optionCode.split(",")).map(OptionCode::valueOf)
                .collect(Collectors.toList());
    }
}
