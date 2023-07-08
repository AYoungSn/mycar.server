package com.autoever.mycar.server.domain.car.dto.req;

import com.autoever.mycar.server.domain.car.entity.code.CarCode;
import com.autoever.mycar.server.domain.car.entity.code.TrimCode;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class TrimInfoDto {
    @NotNull(message = "trimCode 가 null 입니다.")
    private TrimCode trimCode;
    @NotNull(message = "carCode 가 null 입니다.")
    private CarCode carCode;
}
