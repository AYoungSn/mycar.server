package com.autoever.mycar.server.domain.car.dto.res;

import com.autoever.mycar.server.domain.car.dto.res.options.ChangeOptionInfoDto;
import com.autoever.mycar.server.domain.car.dto.res.trim.ChangeTrimInfoDto;
import com.autoever.mycar.server.domain.car.dto.view.ModelResDto;
import com.autoever.mycar.server.domain.car.dto.view.TrimResDto;
import com.autoever.mycar.server.domain.car.entity.Options;
import com.autoever.mycar.server.domain.car.entity.color.Interior;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

import java.util.List;

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

    public ChangeTrimResDto(List<Options> addOptions, List<Options> delOptions, ChangeTrimInfoDto changeTrimInfo) {
        this.changeOptionInfo = new ChangeOptionInfoDto(delOptions, addOptions);
        this.changeTrimInfo = changeTrimInfo;
    }
}
