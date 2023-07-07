package com.autoever.mycar.server.domain.car.dto.res.color;

import com.autoever.mycar.server.domain.car.dto.view.ExteriorDto;
import com.autoever.mycar.server.domain.car.dto.view.InteriorDto;
import lombok.Getter;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class InteriorListResDto {
    private List<InteriorResDto> interior;

    public InteriorListResDto(List<InteriorDto> interior) {
        this.interior = interior.stream().map(InteriorResDto::new).collect(Collectors.toList());
    }

    public void choiceCheck(List<InteriorDto> enableInterior) {
        interior.sort(Comparator.comparing(InteriorResDto::getId));
        enableInterior.sort(Comparator.comparing(InteriorDto::getId));
        int i = 0, j = 0;
        while (i < this.interior.size() && j < enableInterior.size()) {
            if (this.interior.get(i).getId().equals(enableInterior.get(j).getId())) {
                this.interior.get(i).setChoiceYN();
                i++;
                j++;
            } else {
                i++;
            }
        }
        interior.sort((o1, o2) -> o1.getChoiceYN() ? 1: o1.getId().compareTo(o2.getId()));
    }
}
