package com.autoever.mycar.server.domain.tooltips.dto.view;

import com.autoever.mycar.server.domain.entity.type.ToolType;

public interface ToolTipsInfo {
    Long getId();
    String getName();
    ToolType getType();
}
