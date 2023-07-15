package com.autoever.mycar.server.car.adapter.adapter.in.web.dto.res.color;

import com.autoever.mycar.server.car.adapter.adapter.out.view.ExteriorDto;
import com.autoever.mycar.server.car.domain.code.ExteriorCode;
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

    public ExteriorResDto(ExteriorDto dto) {
        this.id = dto.getId();
        this.code = dto.getCode();
        this.name = dto.getName();
        this.imgUri = dto.getImgUri();
        this.price = dto.getPrice();
        this.choiceYn = false;
    }

    public void setChoiceYn() {
        this.choiceYn = true;
    }
}
