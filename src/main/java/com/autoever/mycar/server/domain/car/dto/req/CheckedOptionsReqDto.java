package com.autoever.mycar.server.domain.car.dto.req;

import com.autoever.mycar.server.domain.car.entity.code.ExteriorCode;
import com.autoever.mycar.server.domain.car.entity.code.InteriorCode;
import com.autoever.mycar.server.domain.car.entity.code.OptionCode;
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
public class CheckedOptionsReqDto {
    @NotNull(message = "interiorCode 가 null 입니다.")
    private InteriorCode interiorCode;
//    private ExteriorCode exteriorCode;
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
