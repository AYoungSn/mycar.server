package com.autoever.mycar.server.car.adapter.adapter.in.web.dto.res.options;

import com.autoever.mycar.server.car.domain.Options;
import com.autoever.mycar.server.car.domain.code.OptionCode;
import java.math.BigDecimal;
import lombok.Getter;

@Getter
public class OptionInfoResDto {

    private OptionCode code;
    private String name;
    private BigDecimal price;
    private String imgUri;

    public OptionInfoResDto(Options options) {
        this.code = options.getCode();
        this.name = options.getName();
        this.price = options.getPrice();
        this.imgUri = options.getImgUri();
    }
}
