package com.autoever.mycar.server.car.adapter.in.web.dto.req;

import com.autoever.mycar.server.car.domain.code.CarCode;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ToolTipReqDto {

    @NotNull(message = "carCode 는 필수 값 입니다.")
    @Parameter(name = "carCode", description = "자동차 코드", in = ParameterIn.QUERY)
    private CarCode carCode;
    @Positive(message = "양수만 입력 가능")
    @Parameter(name = "engineId", description = "선택한 엔진의 id", in = ParameterIn.QUERY)
    private Long engineId;
    @Positive(message = "양수만 입력 가능")
    @Parameter(name = "drivingId", description = "선택한 구동방식의 id", in = ParameterIn.QUERY)
    private Long drivingId;
    @Positive(message = "양수만 입력 가능")
    @Parameter(name = "gearboxId", description = "선택한 변속기의 id", in = ParameterIn.QUERY)
    private Long gearboxId;
}
