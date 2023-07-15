package com.autoever.mycar.server.car.adapter.in.web.dto.req;

import com.autoever.mycar.server.car.domain.code.ExteriorCode;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SelectedExteriorReqDto extends TrimInfoDto {

    @NotNull(message = "exteriorCode 가 null 입니다.")
    private ExteriorCode exteriorCode;
}
