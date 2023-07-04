package com.autoever.mycar.server.domain.car.dto.res.options;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class ExteriorResDto {
    private Long id;
    private String name;
    private String imgUri;
    private BigDecimal price;
    private Boolean choiceYN;

    public ExteriorResDto(ExteriorDto dto) {
        this.id = dto.getId();
        this.name = dto.getName();
        this.imgUri = dto.getImgUri();
        this.price = dto.getPrice();
        this.choiceYN = false;
    }

    public void setChoiceYN() {
        this.choiceYN = true;
    }
}