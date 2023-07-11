package com.autoever.mycar.server.car.dto.req;

import com.autoever.mycar.server.car.domain.code.InteriorCode;
import com.autoever.mycar.server.car.domain.code.OptionCode;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class CheckedOptionsInteriorReqDto {
    @NotNull(message = "interiorCode 가 null 입니다.")
    private InteriorCode interiorCode;
    private String optionCode;
    private Long modelId;

    @JsonIgnore
    public List<OptionCode> getOptionCodes() {
        if (optionCode == null || optionCode.isEmpty()) {
            return new ArrayList<>();
        }
        return Arrays.stream(optionCode.split(",")).map(OptionCode::valueOf).collect(Collectors.toList());
    }
}