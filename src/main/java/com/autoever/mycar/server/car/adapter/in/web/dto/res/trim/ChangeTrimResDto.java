package com.autoever.mycar.server.car.adapter.in.web.dto.res.trim;

import com.autoever.mycar.server.car.adapter.in.web.dto.res.options.ChangeOptionInfoDto;
import com.autoever.mycar.server.car.domain.Options;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import lombok.Getter;

@Getter
public class ChangeTrimResDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Schema(description = "인테리어 색상 변경해야 하면 true")
    private Boolean interiorChangeColorYn;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Schema(description = "익스테리어 색상 변경해야 하면 true")
    private Boolean exteriorChangeColorYn;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Schema(description = "삭제되거나 추가되어야 하는 옵션 목록")
    private ChangeOptionInfoDto changeOptionInfo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Schema(description = "변경할 모델에 대한 정보")
    private ChangeTrimInfoDto changeTrimInfo;

    public ChangeTrimResDto(Boolean interiorChangeColorYn, Boolean exteriorChangeColorYn) {
        this.interiorChangeColorYn = interiorChangeColorYn;
        this.exteriorChangeColorYn = exteriorChangeColorYn;
    }

    public ChangeTrimResDto(List<Options> addOptions, List<Options> delOptions,
            ChangeTrimInfoDto changeTrimInfo) {
        this.changeOptionInfo = new ChangeOptionInfoDto(delOptions, addOptions);
        this.changeTrimInfo = changeTrimInfo;
    }
}
