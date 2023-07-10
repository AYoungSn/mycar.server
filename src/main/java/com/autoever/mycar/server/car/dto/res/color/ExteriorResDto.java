package com.autoever.mycar.server.car.dto.res.color;

import com.autoever.mycar.server.car.dto.view.ExteriorDto;
import com.autoever.mycar.server.car.domain.code.ExteriorCode;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class ExteriorResDto {
    private Long id;
    private ExteriorCode code;
    private String name;
    private String imgUri;
    private BigDecimal price;
    private Boolean choiceYN;

    public ExteriorResDto(ExteriorDto dto) {
        this.id = dto.getId();
        this.code = dto.getCode();
        this.name = dto.getName();
        this.imgUri = dto.getImgUri();
        this.price = dto.getPrice();
        this.choiceYN = false;
    }

    public void setChoiceYN() {
        this.choiceYN = true;
    }
}
