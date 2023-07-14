package com.autoever.mycar.server.car.adapter.adapter.in.web;

import com.autoever.mycar.server.car.adapter.adapter.in.web.dto.req.options.CheckedOptionsInteriorReqDto;
import com.autoever.mycar.server.car.adapter.adapter.in.web.dto.req.ColorChangeReqDto;
import com.autoever.mycar.server.car.adapter.adapter.in.web.dto.req.SelectedExteriorReqDto;
import com.autoever.mycar.server.car.adapter.adapter.in.web.dto.req.SelectedInteriorReqDto;
import com.autoever.mycar.server.car.adapter.adapter.in.web.dto.res.trim.ChangeTrimResDto;
import com.autoever.mycar.server.car.adapter.adapter.in.web.dto.res.CheckedOptionResDto;
import com.autoever.mycar.server.car.adapter.adapter.in.web.dto.res.color.ExteriorListResDto;
import com.autoever.mycar.server.car.adapter.adapter.in.web.dto.res.color.InteriorListResDto;
import com.autoever.mycar.server.car.application.service.ColorService;
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
    public CheckedOptionResDto checkedOptions(@Valid CheckedOptionsInteriorReqDto reqDto) {
        return colorService.checkedOption(reqDto.getModelId(), reqDto.getInteriorCode(), reqDto.getOptionCodes());
    }

}
