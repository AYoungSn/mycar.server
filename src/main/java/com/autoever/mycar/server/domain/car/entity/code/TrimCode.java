package com.autoever.mycar.server.domain.car.entity.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TrimCode {
    ATS("Smart", "더 뉴 아반떼"),
    ATM("Modern", "더 뉴 아반떼"),
    ATI("Inspiration", "더 뉴 아반떼"),
    TCM("Modern", "투싼"),
    TCP("Premium", "투싼"),
    TCI("Inspiration", "투싼"),
    ;

    private final String code;
    private final String detail;
}
