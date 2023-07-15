package com.autoever.mycar.server.car.adapter.in.web.dto.res.color;

import com.autoever.mycar.server.car.adapter.out.view.InteriorDto;
import com.autoever.mycar.server.car.domain.code.InteriorCode;
import lombok.Getter;

@Getter
public class InteriorResDto {

    private Long id;
    private String name;
    private String imgUri;
    private Boolean choiceYn;
    private InteriorCode code;

    public InteriorResDto(InteriorDto dto) {
        this.id = dto.getId();
        this.name = dto.getName();
        this.imgUri = dto.getImgUri();
        this.choiceYn = false;
        this.code = dto.getCode();
    }

    public void setChoiceYn() {
        this.choiceYn = true;
    }
}
