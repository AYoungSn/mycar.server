package com.autoever.mycar.server.domain.car.dto.req;

import com.autoever.mycar.server.domain.car.entity.code.ExteriorCode;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class SelectedExteriorReqDto extends TrimInfoDto{
    @NotNull(message = "exteriorCode 가 null 입니다.")
    private ExteriorCode exteriorCode;
}
