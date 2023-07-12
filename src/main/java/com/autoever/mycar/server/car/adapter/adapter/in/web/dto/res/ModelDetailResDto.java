package com.autoever.mycar.server.car.adapter.adapter.in.web.dto.res;

import com.autoever.mycar.server.car.adapter.adapter.in.web.dto.res.color.ExteriorResDto;
import com.autoever.mycar.server.car.adapter.adapter.in.web.dto.res.color.InteriorResDto;
import com.autoever.mycar.server.car.adapter.adapter.in.web.dto.res.options.OptionsListResDto;
import com.autoever.mycar.server.car.adapter.adapter.out.view.InteriorDto;
import com.autoever.mycar.server.car.adapter.adapter.out.view.ModelResDto;
import com.autoever.mycar.server.car.adapter.adapter.out.view.ExteriorDto;
import com.autoever.mycar.server.car.domain.Options;
import lombok.Getter;

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
        exterior.sort(Comparator.comparing(ExteriorResDto::getId));
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
        interior.sort(Comparator.comparing(InteriorResDto::getId));
//        interior.sort((o1, o2) -> o1.getChoiceYN() ? 1: o2.getId().compareTo(o1.getId()));
    }

    public void optionsChoiceCheck(List<Options> options) {
        this.options.optionsChoiceCheck(options);
    }
}
