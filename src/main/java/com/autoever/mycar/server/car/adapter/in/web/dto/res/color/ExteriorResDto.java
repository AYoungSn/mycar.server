package com.autoever.mycar.server.car.adapter.in.web.dto.res.color;

import com.autoever.mycar.server.car.domain.code.ExteriorCode;
import com.autoever.mycar.server.car.domain.color.Exterior;
import java.math.BigDecimal;
import lombok.Getter;

@Getter
public class ExteriorResDto {

    private Long id;
    private ExteriorCode code;
    private String name;
    private String imgUri;
    private BigDecimal price;
    private Boolean choiceYn;

    public ExteriorResDto(Exterior ext) {
        this.id = ext.getId();
        this.code = ext.getCode();
        this.name = ext.getName();
        this.imgUri = ext.getImgUri();
        this.price = ext.getPrice();
        this.choiceYn = false;
    }

    public void setChoiceYn() {
        this.choiceYn = true;
    }
}
