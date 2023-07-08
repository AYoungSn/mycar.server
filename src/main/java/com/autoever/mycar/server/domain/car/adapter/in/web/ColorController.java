package com.autoever.mycar.server.domain.car.adapter.in.web;

import com.autoever.mycar.server.domain.car.dto.req.CheckedOptionsReqDto;
import com.autoever.mycar.server.domain.car.dto.req.ColorChangeReqDto;
import com.autoever.mycar.server.domain.car.dto.req.SelectedExteriorReqDto;
import com.autoever.mycar.server.domain.car.dto.req.SelectedInteriorReqDto;
import com.autoever.mycar.server.domain.car.dto.res.ChangeTrimResDto;
import com.autoever.mycar.server.domain.car.dto.res.CheckedOptionResDto;
import com.autoever.mycar.server.domain.car.dto.res.color.ExteriorListResDto;
import com.autoever.mycar.server.domain.car.dto.res.color.InteriorListResDto;
import com.autoever.mycar.server.domain.car.application.service.ColorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class ColorController {
    private final ColorService colorService;
    @GetMapping("/interior")
    public InteriorListResDto availableInteriorList(@Valid SelectedExteriorReqDto reqDto) {
        return colorService.availableInteriorList(reqDto.getExteriorCode(), reqDto.getTrimCode(), reqDto.getCarCode());
    }

    @GetMapping("/exterior")
    public ExteriorListResDto availableExteriorList(@Valid SelectedInteriorReqDto reqDto) {
        return colorService.availableExteriorList(reqDto.getInteriorCode(), reqDto.getTrimCode(), reqDto.getCarCode());
    }
    @GetMapping("/color-change")
    public ChangeTrimResDto colorChange(@Valid ColorChangeReqDto reqDto) {
        if (!reqDto.getBeforeExteriorCode().equals(reqDto.getExteriorCode())) {
            return colorService.changeExteriorColor(reqDto);
        }
        return colorService.changeInteriorColor(reqDto);
    }
    @GetMapping("/checked-options")
    public CheckedOptionResDto checkedOptions(@Valid CheckedOptionsReqDto reqDto) {
        return colorService.checkedOptionResDto(reqDto.getModelId(), reqDto.getInteriorCode(), reqDto.getOptionCodes());
    }

}
