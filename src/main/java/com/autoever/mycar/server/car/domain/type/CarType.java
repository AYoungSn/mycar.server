package com.autoever.mycar.server.car.domain.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CarType {
    SUV("A", "SUV"), SEDAN("B", "승용");
    private final String code;
    private final String detail;
}
