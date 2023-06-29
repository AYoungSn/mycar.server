package com.autoever.mycar.server.domain.car.dto.req;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Getter
@AllArgsConstructor
public class ModelFilterReqDto {
    @NotNull(message = "carId 는 필수 값 입니다.")
    private Long carId;
    @Positive(message = "양수만 입력 가능")
    private Long engineId;
    @Positive(message = "양수만 입력 가능")
    private Long drivingId;
    @Positive(message = "양수만 입력 가능")
    private Long gearboxId;
}
