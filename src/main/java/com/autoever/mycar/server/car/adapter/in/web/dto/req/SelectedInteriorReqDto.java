package com.autoever.mycar.server.car.adapter.in.web.dto.req;

import com.autoever.mycar.server.car.domain.code.InteriorCode;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SelectedInteriorReqDto extends TrimInfoDto {

    @NotNull(message = "interiorCode 가 null 입니다.")
    private InteriorCode interiorCode;
}
