package com.autoever.mycar.server.car.adapter.adapter.in.web.dto.req;

import com.autoever.mycar.server.car.domain.code.CarCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Getter
@AllArgsConstructor
public class ModelFilterReqDto {
    @NotNull(message = "carCode 는 필수 값 입니다.")
    private CarCode carCode;
    @Positive(message = "양수만 입력 가능")
    private Long engineId;
    @Positive(message = "양수만 입력 가능")
    private Long drivingId;
    @Positive(message = "양수만 입력 가능")
    private Long gearboxId;
}
