package com.autoever.mycar.server.car.dto.res;

import lombok.Getter;

import java.util.List;

@Getter
public class ModelBasicInfoListDto {
    List<String> models;
    public ModelBasicInfoListDto(List<String> models) {
        this.models = models;
    }
}
