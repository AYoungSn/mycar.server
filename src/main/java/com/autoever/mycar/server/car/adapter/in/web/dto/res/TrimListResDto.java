package com.autoever.mycar.server.car.adapter.in.web.dto.res;

import com.autoever.mycar.server.car.adapter.out.view.TrimResDto;
import java.util.List;
import lombok.Getter;

@Getter
public class TrimListResDto {

    private List<TrimResDto> trims;

    public TrimListResDto(List<TrimResDto> trims) {
        this.trims = trims;
    }
}
