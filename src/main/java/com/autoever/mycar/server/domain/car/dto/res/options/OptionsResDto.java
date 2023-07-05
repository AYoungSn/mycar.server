package com.autoever.mycar.server.domain.car.dto.res.options;

import com.autoever.mycar.server.domain.car.entity.Options;
import com.autoever.mycar.server.domain.car.entity.code.OptionCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class OptionsResDto {
    private Long id;
    private String name;
    private BigDecimal price;
    private String imgUri;
    private OptionCode code;

    public OptionsResDto(Options options) {
        this.id = options.getId();
        this.name = options.getName();
        this.price = options.getPrice();
        this.imgUri = options.getImg_uri();
        this.code = options.getCode();
    }
}
