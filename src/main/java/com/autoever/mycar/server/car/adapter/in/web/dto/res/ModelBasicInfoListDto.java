package com.autoever.mycar.server.car.adapter.in.web.dto.res;

import java.util.List;
import lombok.Getter;

@Getter
public class ModelBasicInfoListDto {

    List<String> models;

    public ModelBasicInfoListDto(List<String> models) {
        this.models = models;
    }
}
