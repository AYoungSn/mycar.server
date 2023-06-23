package com.autoever.mycar.server.domain.entity.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CarType {
    SUV("A"), SEDAN("B");
    private final String code;
}
