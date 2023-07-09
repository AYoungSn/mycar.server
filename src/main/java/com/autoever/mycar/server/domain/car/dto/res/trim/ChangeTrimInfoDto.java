package com.autoever.mycar.server.domain.car.dto.res.trim;

import com.autoever.mycar.server.domain.car.dto.view.ModelResDto;
import com.autoever.mycar.server.domain.car.dto.view.TrimResDto;
import com.autoever.mycar.server.domain.car.entity.code.*;
import com.autoever.mycar.server.domain.car.entity.color.Exterior;
import com.autoever.mycar.server.domain.car.entity.color.Interior;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class ChangeTrimInfoDto {
    private String beforeTrimName;
    private BigDecimal beforeCarPrice;
    private String changeTrimName;
    private BigDecimal changeCarPrice;
    private Long changeModelId;
    private CarCode changeCarCode;
    private TrimCode changeTrimCode;
    private InteriorCode interiorCode;
    private ExteriorCode exteriorCode;
    private String colorName;
    private OptionCode optionCode;

    public ChangeTrimInfoDto(ModelResDto modelResDto, TrimResDto trimResDto, Interior interior) {
        this.beforeTrimName = modelResDto.getTrimName();
        this.beforeCarPrice = modelResDto.getPrice();
        this.changeTrimName = trimResDto.getTrimName();
        this.changeCarPrice = trimResDto.getPrice();
        this.changeModelId = trimResDto.getModelId();
        this.changeCarCode = trimResDto.getCarCode();
        this.changeTrimCode = trimResDto.getTrimCode();
        this.interiorCode = interior.getCode();
        this.colorName = interior.getName();
        this.optionCode = optionCode;
    }
    public ChangeTrimInfoDto(ModelResDto modelResDto, TrimResDto trimResDto, Exterior exterior) {
        this.beforeTrimName = modelResDto.getTrimName();
        this.beforeCarPrice = modelResDto.getPrice();
        this.changeTrimName = trimResDto.getTrimName();
        this.changeCarPrice = trimResDto.getPrice();
        this.changeModelId = trimResDto.getModelId();
        this.changeCarCode = trimResDto.getCarCode();
        this.changeTrimCode = trimResDto.getTrimCode();
        this.exteriorCode = exterior.getCode();
        this.colorName = exterior.getName();
        this.optionCode = optionCode;
    }
}
