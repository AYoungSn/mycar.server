package com.autoever.mycar.server.car.dto.res.options;

import com.autoever.mycar.server.car.domain.Options;
import com.autoever.mycar.server.car.domain.code.OptionCode;
import lombok.Getter;

import java.math.BigDecimal;

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
        this.imgUri = options.getImg_uri();
    }
}