package com.autoever.mycar.server.car.adapter.in.web.dto.req;

import com.autoever.mycar.server.car.domain.code.InteriorCode;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SelectedInteriorReqDto extends TrimInfoDto {

    @Parameter(name = "interiorCode", description = "내장 색상 코드", in = ParameterIn.QUERY)
    private InteriorCode interiorCode;
}
