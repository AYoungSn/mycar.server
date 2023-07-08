package com.autoever.mycar.server.domain.car.dto.req;

import com.autoever.mycar.server.domain.car.entity.code.InteriorCode;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class SelectedInteriorReqDto extends TrimInfoDto {
    @NotNull(message = "interiorCode 가 null 입니다.")
    private InteriorCode interiorCode;
}
