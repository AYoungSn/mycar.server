package com.autoever.mycar.server.domain.car.dto.res.trim;

import com.autoever.mycar.server.domain.car.dto.view.ModelResDto;
import com.autoever.mycar.server.domain.car.dto.view.TrimResDto;
import com.autoever.mycar.server.domain.car.entity.code.CarCode;
import com.autoever.mycar.server.domain.car.entity.code.InteriorCode;
import com.autoever.mycar.server.domain.car.entity.code.OptionCode;
import com.autoever.mycar.server.domain.car.entity.code.TrimCode;
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
    private String interiorName;
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
        this.interiorName = interior.getName();
        this.optionCode = optionCode;
    }
}
