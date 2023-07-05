package com.autoever.mycar.server.domain.car.dto.res.options;

import com.autoever.mycar.server.domain.car.dto.view.InteriorDto;
import lombok.Getter;

@Getter
public class InteriorResDto {
    private Long id;
    private String name;
    private String imgUri;
    private Boolean choiceYN;

    public InteriorResDto(InteriorDto dto) {
        this.id = dto.getId();
        this.name = dto.getName();
        this.imgUri = dto.getImgUri();
        this.choiceYN = false;
    }
    public void setChoiceYN() {
        this.choiceYN = true;
    }
}
