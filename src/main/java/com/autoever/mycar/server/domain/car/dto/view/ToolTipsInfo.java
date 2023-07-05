package com.autoever.mycar.server.domain.car.dto.view;

import com.autoever.mycar.server.domain.car.entity.type.ToolType;

public interface ToolTipsInfo {
    Long getId();
    String getName();
    ToolType getType();
}
