package com.autoever.mycar.server.domain.car.dto.req;

import com.autoever.mycar.server.domain.car.entity.code.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public class ColorChangeReqDto {
    @NotNull(message = "beforeInteriorCode 가 null 입니다.")
    private InteriorCode beforeInteriorCode;
    @NotNull(message = "beforeInteriorCode 가 null 입니다.")
    private ExteriorCode beforeExteriorCode;
    @NotNull(message = "interiorCode 가 null 입니다.")
    private InteriorCode interiorCode;
    @NotNull(message = "exteriorCode 가 null 입니다.")
    private ExteriorCode exteriorCode;
    @NotNull(message = "modelId 가 null 입니다.")
    private Long modelId;
    @NotNull(message = "carCode 가 null 입니다.")
    private CarCode carCode;
    @NotNull(message = "optionCode 가 null 입니다.")
    private String optionCode;
    @JsonIgnore
    public List<OptionCode> getOptionCodes() {
        if (optionCode == null || optionCode.isEmpty()) {
            return new ArrayList<>();
        }
        return Arrays.stream(optionCode.split(",")).map(OptionCode::valueOf).collect(Collectors.toList());
    }
}
