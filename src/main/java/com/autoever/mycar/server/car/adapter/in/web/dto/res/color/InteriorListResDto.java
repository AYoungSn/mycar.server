package com.autoever.mycar.server.car.adapter.in.web.dto.res.color;

import com.autoever.mycar.server.car.domain.color.Interior;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;

@Getter
public class InteriorListResDto {

    private List<InteriorResDto> interior;

    public InteriorListResDto(List<Interior> interior) {
        this.interior = interior.stream().map(InteriorResDto::new).collect(Collectors.toList());
    }

    public void choiceCheck(List<Interior> enableInterior) {
        interior.sort(Comparator.comparing(InteriorResDto::getId));
        enableInterior.sort(Comparator.comparing(Interior::getId));
        int i = 0;
        int j = 0;
        while (i < this.interior.size() && j < enableInterior.size()) {
            if (this.interior.get(i).getId().equals(enableInterior.get(j).getId())) {
                this.interior.get(i).setChoiceYn();
                i++;
                j++;
            } else {
                i++;
            }
        }
        interior.sort(Comparator.comparing(InteriorResDto::getId));
    }
}
