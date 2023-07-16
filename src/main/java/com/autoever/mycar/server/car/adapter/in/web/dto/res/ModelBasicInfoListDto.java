package com.autoever.mycar.server.car.adapter.in.web.dto.res;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import lombok.Getter;

@Getter
@Schema(description = "모델 basic info 이름 조회")
public class ModelBasicInfoListDto {

    @Schema(description = "basic info 목록")
    List<String> models;

    public ModelBasicInfoListDto(List<String> models) {
        this.models = models;
    }
}
