package com.autoever.mycar.server.car.adapter.adapter.in.web.dto.res;

import com.autoever.mycar.server.car.adapter.adapter.out.view.TrimResDto;
import lombok.Getter;

import java.util.List;

@Getter
public class TrimListResDto {
    private List<TrimResDto> trims;

    public TrimListResDto(List<TrimResDto> trims) {
        this.trims = trims;
    }
}
