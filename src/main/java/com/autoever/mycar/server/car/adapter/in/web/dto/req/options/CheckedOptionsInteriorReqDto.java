package com.autoever.mycar.server.car.adapter.in.web.dto.req.options;

import com.autoever.mycar.server.car.domain.code.InteriorCode;
import com.autoever.mycar.server.car.domain.code.OptionCode;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CheckedOptionsInteriorReqDto {

    @NotNull(message = "interiorCode 가 null 입니다.")
    @Parameter(name = "interiorCode", description = "선택한 인테리어 코드", in = ParameterIn.QUERY)
    private InteriorCode interiorCode;
    @Parameter(name = "optionCode", description = "현재 선택된 옵션 코드 목록",
            in = ParameterIn.QUERY, example = "PLL,HRR,")
    private String optionCode;
    @Parameter(name = "modelId", description = "현재 모델 id", in = ParameterIn.QUERY)
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
