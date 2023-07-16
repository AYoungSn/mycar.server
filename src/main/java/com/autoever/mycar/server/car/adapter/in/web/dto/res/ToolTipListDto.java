package com.autoever.mycar.server.car.adapter.in.web.dto.res;

import com.autoever.mycar.server.car.adapter.out.view.tooltips.ToolTipsInfo;
import com.autoever.mycar.server.car.domain.type.ToolType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
@Schema(description = "선택 가능한 툴팁 목록")
public class ToolTipListDto {

    @Schema(description = "엔진 목록")
    private List<ToolTipFilterResDto> engines;
    @Schema(description = "변속기 목록")
    private List<ToolTipFilterResDto> gearbox;
    @Schema(description = "구동방식 목록")
    private List<ToolTipFilterResDto> driving;

    public ToolTipListDto(List<ToolTipsInfo> toolTips) {
        this.engines = new ArrayList<>();
        this.gearbox = new ArrayList<>();
        this.driving = new ArrayList<>();
        for (ToolTipsInfo tooltip :
                toolTips) {
            if (tooltip.getType().equals(ToolType.ENGINE)) {
                engines.add(new ToolTipFilterResDto(tooltip, true));
            } else if (tooltip.getType().equals(ToolType.GEARBOX)) {
                gearbox.add(new ToolTipFilterResDto(tooltip, false));
            } else if (tooltip.getType().equals(ToolType.DRIVING)) {
                driving.add(new ToolTipFilterResDto(tooltip, true));
            }
        }
    }

    public void setGearbox(List<ToolTipsInfo> gearboxes) {
        for (ToolTipsInfo gb :
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
