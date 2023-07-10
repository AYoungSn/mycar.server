package com.autoever.mycar.server.car.domain.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum OptionCategory {
    DETAIL("D", "Detail"),
    HGA("H", "H Genuine Accessories"),
    NPF("N", "N Performance");
    private final String code;
    private final String desc;
}
