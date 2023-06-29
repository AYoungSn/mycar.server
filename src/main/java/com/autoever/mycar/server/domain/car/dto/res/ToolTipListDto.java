package com.autoever.mycar.server.domain.car.dto.res;

import com.autoever.mycar.server.domain.entity.type.ToolType;
import com.autoever.mycar.server.domain.tooltips.dto.view.ToolTipsInfo;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ToolTipListDto {
    private List<EngineFilterResDto> engines;
    private List<GearboxFilterResDto> gearbox;
    private List<DrivingFilterResDto> driving;

    public ToolTipListDto(List<ToolTipsInfo> toolTips) {
        this.engines = new ArrayList<>();
        this.gearbox = new ArrayList<>();
        this.driving = new ArrayList<>();
        for (ToolTipsInfo tooltip:
                toolTips) {
            if (tooltip.getType().equals(ToolType.ENGINE))
                engines.add(new EngineFilterResDto(tooltip));
            else if (tooltip.getType().equals(ToolType.GEARBOX))
                gearbox.add(new GearboxFilterResDto(tooltip));
            else if (tooltip.getType().equals(ToolType.DRIVING))
                driving.add(new DrivingFilterResDto(tooltip));
        }
    }

    public void setGearbox(List<ToolTipsInfo> gearboxes) {
        for (ToolTipsInfo gb:
             gearboxes) {
            for (int i = 0; i < this.gearbox.size(); i++) {
                if (this.gearbox.get(i).getGearboxId().equals(gb.getId())) {
                    this.gearbox.get(i).setIsSelect(true);
                    break;
                }
            }
        }
    }
}
