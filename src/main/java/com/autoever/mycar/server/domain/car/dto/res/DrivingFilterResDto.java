package com.autoever.mycar.server.domain.car.dto.res;

import com.autoever.mycar.server.domain.tooltips.dto.view.ToolTipsInfo;
import lombok.Getter;

@Getter
public class DrivingFilterResDto extends FilterEnableDto{
    private Long drivingId;
    private String drivingName;

    public DrivingFilterResDto(ToolTipsInfo toolTips) {
        super(true);
        this.drivingId = toolTips.getId();
        this.drivingName = toolTips.getName();
    }
}
