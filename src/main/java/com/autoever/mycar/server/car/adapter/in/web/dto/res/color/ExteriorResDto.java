package com.autoever.mycar.server.car.adapter.in.web.dto.res.color;

import com.autoever.mycar.server.car.domain.code.ExteriorCode;
import com.autoever.mycar.server.car.domain.color.Exterior;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import lombok.Getter;

@Getter
@Schema(description = "외장 색상 정보")
public class ExteriorResDto {

    private Long id;
    @Schema(description = "외장 색상 코드")
    private ExteriorCode code;
    @Schema(description = "외장 색상 이름")
    private String name;
    @Schema(description = "외장 색상 이미지")
    private String imgUri;
    @Schema(description = "외장 색상 가격")
    private BigDecimal price;
    @Schema(description = "현재 선택 가능한 색상인지")
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
