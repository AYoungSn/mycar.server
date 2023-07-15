package com.autoever.mycar.server.car.adapter.in.web.dto.req;

import com.autoever.mycar.server.car.domain.code.CarCode;
import com.autoever.mycar.server.car.domain.code.TrimCode;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrimInfoDto {

    @NotNull(message = "trimCode 가 null 입니다.")
    private TrimCode trimCode;
    @NotNull(message = "carCode 가 null 입니다.")
    private CarCode carCode;
}
