package com.autoever.mycar.server.car.adapter.in.web.dto.req.options;

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
public class ChangeOptionReqDto {

    private String optionCode;
    @NotNull(message = "addOption 이 null 입니다.")
    private OptionCode addOption;
    @NotNull(message = "modelId 가 null 입니다.")
    private Long modelId;

    @JsonIgnore
    public List<OptionCode> getOptionCodes() {
        if (optionCode == null || optionCode.isEmpty()) {
            return new ArrayList<>();
        }
        return Arrays.stream(optionCode.split(","))
                .map(OptionCode::valueOf).collect(Collectors.toList());
    }
}
