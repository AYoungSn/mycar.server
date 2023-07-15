package com.autoever.mycar.server.car.adapter.adapter.in.web.dto.res.trim;

import com.autoever.mycar.server.car.adapter.adapter.in.web.dto.res.options.ChangeOptionInfoDto;
import com.autoever.mycar.server.car.domain.Options;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import lombok.Getter;

@Getter
public class ChangeTrimResDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean interiorChangeColorYn;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean exteriorChangeColorYn;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ChangeOptionInfoDto changeOptionInfo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
