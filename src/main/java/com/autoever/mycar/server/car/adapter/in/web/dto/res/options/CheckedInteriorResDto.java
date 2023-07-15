package com.autoever.mycar.server.car.adapter.in.web.dto.res.options;

import com.autoever.mycar.server.car.domain.code.InteriorCode;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CheckedInteriorResDto {

    private Boolean available;
    private List<InteriorCode> interiorCodes;
}
