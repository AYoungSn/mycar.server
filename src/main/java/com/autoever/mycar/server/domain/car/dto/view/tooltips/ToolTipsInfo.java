package com.autoever.mycar.server.domain.car.dto.view.tooltips;

import com.autoever.mycar.server.domain.car.entity.type.ToolType;

public interface ToolTipsInfo {
    Long getId();
    String getName();
    ToolType getType();
}
