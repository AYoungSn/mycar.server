package com.autoever.mycar.server.car.adapter.in.web.dto.res;

import com.autoever.mycar.server.car.adapter.out.view.tooltips.ToolTipsInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

@Getter
@Schema(description = "각 자동차 종류별 선택 가능한 툴팁")
public class ToolTipFilterResDto {

    @Schema(description = "툴팁의 id")
    private Long id;
    @Schema(description = "툴팁 이름")
    private String name;
    @Schema(description = "현재 선택된 툴팁을 기준으로 조합이 가능한 툴팁인지 나타냄")
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
