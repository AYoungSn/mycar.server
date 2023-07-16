package com.autoever.mycar.server.car.adapter.in.web.dto.req.options;

import com.autoever.mycar.server.car.domain.code.OptionCode;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ChangeOptionReqDto {

    @Parameter(name = "optionCode", description = "기존 선택한 옵션 코드",
            in = ParameterIn.QUERY, example = "PLL,HRR,")
    private String optionCode;
    @NotNull(message = "addOption 이 null 입니다.")
    @Parameter(name = "addOption", description = "새로 선택한 옵션 코드", in = ParameterIn.QUERY)
    private OptionCode addOption;
    @NotNull(message = "modelId 가 null 입니다.")
    @Parameter(name = "modelId", description = "현재 model id", in = ParameterIn.QUERY)
    private Long modelId;

    @JsonIgnore
    public List<OptionCode> getOptionCodes() {
        if (optionCode == null || optionCode.isEmpty()) {
            return new ArrayList<>();
        }
        return Arrays.stream(optionCode.split(","))
                .map(OptionCode::valueOf).collect(Collectors.toList());
    }
}
