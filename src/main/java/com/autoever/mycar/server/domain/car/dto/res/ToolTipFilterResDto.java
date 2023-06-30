package com.autoever.mycar.server.domain.car.dto.res;

import com.autoever.mycar.server.domain.tooltips.dto.view.ToolTipsInfo;
import lombok.Getter;
@Getter
public class EngineFilterResDto extends FilterEnableDto{
    private Long engineId;
    private String engineName;
    public EngineFilterResDto(ToolTipsInfo toolTips) {
        super(true);
        this.engineId = toolTips.getId();
        this.engineName = toolTips.getName();
    }
}
