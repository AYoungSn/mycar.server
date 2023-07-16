package com.autoever.mycar.server.car.adapter.in.web.dto.req.options;

import com.autoever.mycar.server.car.domain.code.OptionCode;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TrimChangeReqDto {

    @Parameter(name = "beforeModelId", description = "기존 model id", in = ParameterIn.QUERY)
    private Long beforeModelId;
    @Parameter(name = "afterModelId", description = "변경하려는 model id", in = ParameterIn.QUERY)
    private Long afterModelId;
    @Parameter(name = "optionCode", description = "선택한 옵션 코드",
            in = ParameterIn.QUERY, example = "PLL,HRR,")
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
