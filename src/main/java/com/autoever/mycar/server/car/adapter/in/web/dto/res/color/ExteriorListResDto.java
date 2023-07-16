package com.autoever.mycar.server.car.adapter.in.web.dto.res.color;

import com.autoever.mycar.server.car.domain.color.Exterior;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;

@Getter
public class ExteriorListResDto {

    @Schema(description = "외장 색상 목록")
    private List<ExteriorResDto> exterior;

    public ExteriorListResDto(List<Exterior> exterior) {
        this.exterior = exterior.stream().map(ExteriorResDto::new).collect(Collectors.toList());
    }

    public void choiceCheck(List<Exterior> enableExterior) {
        exterior.sort(Comparator.comparing(ExteriorResDto::getId));
        enableExterior.sort(Comparator.comparing(Exterior::getId));
        int i = 0;
        int j = 0;
        while (i < this.exterior.size() && j < enableExterior.size()) {
            if (this.exterior.get(i).getId().equals(enableExterior.get(j).getId())) {
                this.exterior.get(i).setChoiceYn();
                i++;
                j++;
            } else {
                i++;
            }
        }
        exterior.sort(Comparator.comparing(ExteriorResDto::getId));
    }
}
