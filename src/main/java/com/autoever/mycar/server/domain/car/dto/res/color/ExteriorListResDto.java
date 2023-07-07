package com.autoever.mycar.server.domain.car.dto.res.color;

import com.autoever.mycar.server.domain.car.dto.view.ExteriorDto;
import lombok.Getter;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class ExteriorListResDto {
    private List<ExteriorResDto> exterior;

    public ExteriorListResDto(List<ExteriorDto> exterior) {
        this.exterior = exterior.stream().map(ExteriorResDto::new).collect(Collectors.toList());
    }

    public void choiceCheck(List<ExteriorDto> enableExterior) {
        exterior.sort(Comparator.comparing(ExteriorResDto::getId));
        enableExterior.sort(Comparator.comparing(ExteriorDto::getId));
        int i = 0, j = 0;
        while (i < this.exterior.size() && j < enableExterior.size()) {
            if (this.exterior.get(i).getId().equals(enableExterior.get(j).getId())) {
                this.exterior.get(i).setChoiceYN();
                i++;
                j++;
            } else {
                i++;
            }
        }
        exterior.sort((o1, o2) -> o1.getChoiceYN() ? 1: o1.getId().compareTo(o2.getId()));
    }
}
