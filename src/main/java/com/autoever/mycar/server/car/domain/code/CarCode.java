package com.autoever.mycar.server.car.domain.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CarCode {
    AT01("AVANTE", "더 뉴 아반떼"),
    TC01("TUSCON", "투싼");

    private final String code;
    private final String detail;
}
