package com.autoever.mycar.server.car.dto.view.tooltips;

import com.autoever.mycar.server.car.domain.type.ToolType;

public interface ToolTipsInfo {
    Long getId();
    String getName();
    ToolType getType();
}
