package com.autoever.mycar.server.domain.car.dto.res;

import com.autoever.mycar.server.domain.entity.tooltips.ToolTips;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class DrivingFilterResDto {
    private Long drivingId;
    private String drivingName;
    private Boolean isSelect;

    public DrivingFilterResDto(ToolTips toolTips) {
        this.drivingId = toolTips.getId();
        this.drivingName = toolTips.getName();
    }
}
