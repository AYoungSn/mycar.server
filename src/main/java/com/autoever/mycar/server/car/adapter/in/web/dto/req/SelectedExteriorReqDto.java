package com.autoever.mycar.server.car.adapter.in.web.dto.req;

import com.autoever.mycar.server.car.domain.code.ExteriorCode;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SelectedExteriorReqDto extends TrimInfoDto {

    @NotNull(message = "exteriorCode 가 null 입니다.")
    @Parameter(name = "exteriorCode", description = "외장 색상 코드", in = ParameterIn.QUERY)
    private ExteriorCode exteriorCode;
}
