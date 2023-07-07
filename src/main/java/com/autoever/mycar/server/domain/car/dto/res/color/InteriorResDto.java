package com.autoever.mycar.server.domain.car.dto.res.color;

import com.autoever.mycar.server.domain.car.dto.view.InteriorDto;
import com.autoever.mycar.server.domain.car.entity.code.InteriorCode;
import lombok.Getter;

@Getter
public class InteriorResDto {
    private Long id;
    private String name;
    private String imgUri;
    private Boolean choiceYN;
    private InteriorCode code;

    public InteriorResDto(InteriorDto dto) {
        this.id = dto.getId();
        this.name = dto.getName();
        this.imgUri = dto.getImgUri();
        this.choiceYN = false;
        this.code = dto.getCode();
    }
    public void setChoiceYN() {
        this.choiceYN = true;
    }
}
