package com.autoever.mycar.server.car.adapter.adapter.in.web.dto.res.trim;

import com.autoever.mycar.server.car.adapter.adapter.out.view.ModelResDto;
import com.autoever.mycar.server.car.adapter.adapter.out.view.TrimResDto;
import com.autoever.mycar.server.car.domain.code.CarCode;
import com.autoever.mycar.server.car.domain.code.ExteriorCode;
import com.autoever.mycar.server.car.domain.code.InteriorCode;
import com.autoever.mycar.server.car.domain.code.TrimCode;
import com.autoever.mycar.server.car.domain.color.Exterior;
import com.autoever.mycar.server.car.domain.color.Interior;
import java.math.BigDecimal;
import lombok.Getter;

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
    }
}
