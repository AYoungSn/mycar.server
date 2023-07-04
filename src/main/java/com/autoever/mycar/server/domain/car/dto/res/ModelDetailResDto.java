package com.autoever.mycar.server.domain.car.dto.res;

import com.autoever.mycar.server.domain.car.dto.res.options.*;
import com.autoever.mycar.server.domain.entity.Options;
import lombok.Getter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class ModelDetailResDto {
    private ModelResDto model;
    private List<ExteriorResDto> exterior;
    private List<InteriorResDto> interior;
    private OptionsListResDto options;

    public ModelDetailResDto(ModelResDto model, List<ExteriorDto> exterior, List<InteriorDto> interior, List<Options> optionsList) {
        this.model = model;
        this.exterior = exterior.stream().map(ExteriorResDto::new).collect(Collectors.toList());
        this.interior = interior.stream().map(InteriorResDto::new).collect(Collectors.toList());
        this.options = new OptionsListResDto(optionsList);
    }

    public void exteriorChoiceCheck(List<ExteriorDto> enableExterior) {
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
    public void interiorChoiceCheck(List<InteriorDto> enableInterior) {
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