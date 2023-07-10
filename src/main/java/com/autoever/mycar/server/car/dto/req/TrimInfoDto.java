package com.autoever.mycar.server.car.dto.req;

import com.autoever.mycar.server.car.domain.code.CarCode;
import com.autoever.mycar.server.car.domain.code.TrimCode;
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
