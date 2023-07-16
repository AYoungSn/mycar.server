package com.autoever.mycar.server.car.adapter.in.web.dto.res;

import com.autoever.mycar.server.car.adapter.in.web.dto.res.color.ExteriorResDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.res.color.InteriorResDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.res.options.OptionsListResDto;
import com.autoever.mycar.server.car.adapter.out.view.ModelResDto;
import com.autoever.mycar.server.car.domain.Options;
import com.autoever.mycar.server.car.domain.color.Exterior;
import com.autoever.mycar.server.car.domain.color.Interior;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;

@Getter
@Schema(description = "모델, 색상, 옵션 상세 정보")
public class ModelDetailResDto {

    @Schema(description = "모델 상세 정보")
    private ModelResDto model;
    @Schema(description = "외장 색상 목록")
    private List<ExteriorResDto> exterior;
    @Schema(description = "내장 색상 목록")
    private List<InteriorResDto> interior;
    @Schema(description = "옵션 목록")
    private OptionsListResDto options;

    public ModelDetailResDto(ModelResDto model, List<Exterior> exterior,
            List<Interior> interior, List<Options> optionsList) {
        this.model = model;
        this.exterior = exterior.stream().map(ExteriorResDto::new).collect(Collectors.toList());
        this.interior = interior.stream().map(InteriorResDto::new).collect(Collectors.toList());
        this.options = new OptionsListResDto(optionsList);
    }

    public void exteriorChoiceCheck(List<Exterior> enableExterior) {
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

    public void interiorChoiceCheck(List<Interior> enableInterior) {
        for (int i = 0; i < interior.size(); i++) {
            System.out.println(interior.get(i).getId());
        }
        System.out.println("***");
        for (int i = 0; i < enableInterior.size(); i++) {
            System.out.println(enableInterior.get(i).getId());
        }
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

    public void optionsChoiceCheck(List<Options> options) {
        this.options.optionsChoiceCheck(options);
    }
}
