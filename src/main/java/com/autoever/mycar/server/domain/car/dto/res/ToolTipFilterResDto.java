package com.autoever.mycar.server.domain.car.dto.res;

import com.autoever.mycar.server.domain.car.view.ToolTipsInfo;
import lombok.Getter;
@Getter
public class ToolTipFilterResDto {
    private Long id;
    private String name;
    private Boolean isSelect;
    public ToolTipFilterResDto(ToolTipsInfo toolTips, Boolean isSelect) {
        this.id = toolTips.getId();
        this.name = toolTips.getName();
        this.isSelect = isSelect;
    }
    public void setIsSelect(Boolean select) {
        isSelect = select;
    }
}
