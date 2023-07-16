package com.autoever.mycar.server.car.adapter.in.web.dto.res.options;

import com.autoever.mycar.server.car.domain.code.InteriorCode;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CheckedInteriorResDto {

    @Schema(description = "available 이 true 이면 선택되어야 하는 인테리어 있음")
    private Boolean available;
    @Schema(description = "선택되어야 하는 인테리어 코드 목록")
    private List<InteriorCode> interiorCodes;
}
