package com.autoever.mycar.server.car.adapter.in.web.dto.req;

import com.autoever.mycar.server.car.domain.code.InteriorCode;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SelectedInteriorReqDto extends TrimInfoDto {

    @NotNull(message = "interiorCode 가 null 입니다.")
    @Parameter(name = "interiorCode", description = "내장 색상 코드", in = ParameterIn.QUERY)
    private InteriorCode interiorCode;
}
