package com.autoever.mycar.server.car.adapter.adapter.in.web.dto.res.options;

import com.autoever.mycar.server.car.domain.Options;
import com.autoever.mycar.server.car.domain.code.OptionCode;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class OptionsResDto {

    private Long id;
    private String name;
    private BigDecimal price;
    private String imgUri;
    private OptionCode code;
    @Setter
    private Boolean choiceYn;

    public OptionsResDto(Options options) {
        this.id = options.getId();
        this.name = options.getName();
        this.price = options.getPrice();
        this.imgUri = options.getImgUri();
        this.code = options.getCode();
        this.choiceYn = true;
    }
}
