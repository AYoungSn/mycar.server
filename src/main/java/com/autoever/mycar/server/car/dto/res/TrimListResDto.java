package com.autoever.mycar.server.car.dto.res;

import com.autoever.mycar.server.car.dto.view.TrimResDto;
import lombok.Getter;

import java.util.List;

@Getter
public class TrimListResDto {
    private List<TrimResDto> trims;

    public TrimListResDto(List<TrimResDto> trims) {
        this.trims = trims;
    }
}