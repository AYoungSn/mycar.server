package com.autoever.mycar.server.domain.car.dto.res;

import com.autoever.mycar.server.domain.entity.type.ToolType;
import com.autoever.mycar.server.domain.car.view.ToolTipsInfo;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ToolTipListDto {
    private List<ToolTipFilterResDto> engines;
    private List<ToolTipFilterResDto> gearbox;
    private List<ToolTipFilterResDto> driving;

    public ToolTipListDto(List<ToolTipsInfo> toolTips) {
        this.engines = new ArrayList<>();
        this.gearbox = new ArrayList<>();
        this.driving = new ArrayList<>();
        for (ToolTipsInfo tooltip:
                toolTips) {
            if (tooltip.getType().equals(ToolType.ENGINE))
                engines.add(new ToolTipFilterResDto(tooltip, true));
            else if (tooltip.getType().equals(ToolType.GEARBOX))
                gearbox.add(new ToolTipFilterResDto(tooltip, false));
            else if (tooltip.getType().equals(ToolType.DRIVING))
                driving.add(new ToolTipFilterResDto(tooltip, true));
        }
    }

    public void setGearbox(List<ToolTipsInfo> gearboxes) {
        for (ToolTipsInfo gb:
             gearboxes) {
            for (int i = 0; i < this.gearbox.size(); i++) {
                if (this.gearbox.get(i).getId().equals(gb.getId())) {
                    this.gearbox.get(i).setIsSelect(true);
                    break;
                }
            }
        }
    }
}
