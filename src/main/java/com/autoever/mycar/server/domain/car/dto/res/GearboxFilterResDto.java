package com.autoever.mycar.server.domain.car.dto.res;

import com.autoever.mycar.server.domain.tooltips.dto.view.ToolTipsInfo;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class GearboxFilterResDto extends FilterEnableDto{
    private Long gearboxId;
    private String gearboxName;
    public GearboxFilterResDto(ToolTipsInfo toolTips) {
        super();
        this.gearboxId = toolTips.getId();
        this.gearboxName = toolTips.getName();
    }
}
