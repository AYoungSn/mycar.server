package com.autoever.mycar.server.domain.entity.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ToolType {
    ENGINE("E", "engines"),
    GEARBOX("G", "gearbox"),
    DRIVING("D", "driving method")
    ;
    private final String code;
    private final String desc;
}
