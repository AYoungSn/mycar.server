package com.autoever.mycar.server.car.adapter.adapter.in.web.dto.req;

import com.autoever.mycar.server.car.domain.code.CarCode;
import com.autoever.mycar.server.car.domain.code.ExteriorCode;
import com.autoever.mycar.server.car.domain.code.InteriorCode;
import com.autoever.mycar.server.car.domain.code.OptionCode;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ColorChangeReqDto {

    @NotNull(message = "beforeInteriorCode 가 null 입니다.")
    private InteriorCode beforeInteriorCode;
    @NotNull(message = "beforeInteriorCode 가 null 입니다.")
    private ExteriorCode beforeExteriorCode;
    @NotNull(message = "interiorCode 가 null 입니다.")
    private InteriorCode interiorCode;
    @NotNull(message = "exteriorCode 가 null 입니다.")
    private ExteriorCode exteriorCode;
    @NotNull(message = "modelId 가 null 입니다.")
    private Long modelId;
    @NotNull(message = "carCode 가 null 입니다.")
    private CarCode carCode;
    @NotNull(message = "optionCode 가 null 입니다.")
    private String optionCode;

    @JsonIgnore
    public List<OptionCode> getOptionCodes() {
        if (optionCode == null || optionCode.isEmpty()) {
            return new ArrayList<>();
        }
        return Arrays.stream(optionCode.split(",")).map(OptionCode::valueOf)
                .collect(Collectors.toList());
    }
}
