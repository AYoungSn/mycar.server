package com.autoever.mycar.server.domain.car.entity.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CarType {
    SUV("A", "SUV"), SEDAN("B", "승용");
    private final String code;
    private final String detail;
}
