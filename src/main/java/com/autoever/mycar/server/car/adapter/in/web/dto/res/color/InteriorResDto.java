package com.autoever.mycar.server.car.adapter.in.web.dto.res.color;

import com.autoever.mycar.server.car.domain.code.InteriorCode;
import com.autoever.mycar.server.car.domain.color.Interior;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

@Getter
@Schema(description = "내장 색상 정보")
public class InteriorResDto {

    private Long id;
    @Schema(description = "내장 색상 이름")
    private String name;
    @Schema(description = "내장 색상 이미지")
    private String imgUri;
    @Schema(description = "현재 선택 가능한 색상인지")
    private Boolean choiceYn;
    @Schema(description = "내장 색상 코드")
    private InteriorCode code;

    public InteriorResDto(Interior dto) {
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
