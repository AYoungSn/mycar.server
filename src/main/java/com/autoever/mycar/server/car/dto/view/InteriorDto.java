package com.autoever.mycar.server.car.dto.view;

import com.autoever.mycar.server.car.domain.code.InteriorCode;

public interface InteriorDto {
    Long getId();
    String getName();
    String getImgUri();
    InteriorCode getCode();
}
