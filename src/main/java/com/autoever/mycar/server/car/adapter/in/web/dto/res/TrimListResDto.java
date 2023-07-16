package com.autoever.mycar.server.car.adapter.in.web.dto.res;

import com.autoever.mycar.server.car.adapter.out.view.TrimResDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import lombok.Getter;

@Getter
@Schema(description = "현재 선택 가능한 트림 목록")
public class TrimListResDto {

    private List<TrimResDto> trims;

    public TrimListResDto(List<TrimResDto> trims) {
        this.trims = trims;
    }
}
