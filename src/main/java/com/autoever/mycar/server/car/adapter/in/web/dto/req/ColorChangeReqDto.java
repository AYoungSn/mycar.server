package com.autoever.mycar.server.car.adapter.in.web.dto.req;

import com.autoever.mycar.server.car.domain.code.CarCode;
import com.autoever.mycar.server.car.domain.code.ExteriorCode;
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
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ColorChangeReqDto {

    @NotNull(message = "beforeInteriorCode 가 null 입니다.")
    @Parameter(name = "beforeInteriorCode", description = "기존 내장 색상 코드", in = ParameterIn.QUERY)
    private InteriorCode beforeInteriorCode;
    @NotNull(message = "beforeExteriorCode 가 null 입니다.")
    @Parameter(name = "beforeExteriorCode", description = "기존 외장 색상 코드", in = ParameterIn.QUERY)
    private ExteriorCode beforeExteriorCode;
    @NotNull(message = "interiorCode 가 null 입니다.")
    @Parameter(name = "interiorCode", description = "선택하려는 내장 색상 코드", in = ParameterIn.QUERY)
    private InteriorCode interiorCode;
    @NotNull(message = "exteriorCode 가 null 입니다.")
    @Parameter(name = "exteriorCode", description = "선택하려는 외장 색상 코드", in = ParameterIn.QUERY)
    private ExteriorCode exteriorCode;
    @NotNull(message = "modelId 가 null 입니다.")
    @Parameter(name = "modelId", description = "현재 모델 id", in = ParameterIn.QUERY)
    private Long modelId;
    @NotNull(message = "carCode 가 null 입니다.")
    @Parameter(name = "carCode", description = "현재 모델 carCode", in = ParameterIn.QUERY)
    private CarCode carCode;
    @NotNull(message = "optionCode 가 null 입니다.")
    @Parameter(name = "optionCode", description = "현재 선택된 옵션 코드 목록",
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
