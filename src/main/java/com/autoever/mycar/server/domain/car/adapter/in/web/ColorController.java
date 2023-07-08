package com.autoever.mycar.server.domain.car.adapter.in.web;

import com.autoever.mycar.server.domain.car.dto.req.CheckedOptionsReqDto;
import com.autoever.mycar.server.domain.car.dto.req.SelectedExteriorReqDto;
import com.autoever.mycar.server.domain.car.dto.req.SelectedInteriorReqDto;
import com.autoever.mycar.server.domain.car.dto.res.CheckedOptionResDto;
import com.autoever.mycar.server.domain.car.dto.res.color.ExteriorListResDto;
import com.autoever.mycar.server.domain.car.dto.res.color.InteriorListResDto;
import com.autoever.mycar.server.domain.car.application.service.OptionService;
import com.autoever.mycar.server.domain.car.entity.code.OptionCode;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Set;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class ColorController {
    private final OptionService colorService;
    @GetMapping("/interior")
    public InteriorListResDto availableInteriorList(@Valid SelectedExteriorReqDto reqDto) {
        return colorService.availableInteriorList(reqDto.getExteriorCode(), reqDto.getTrimCode(), reqDto.getCarCode());
    }

    @GetMapping("/exterior")
    public ExteriorListResDto availableExteriorList(@Valid SelectedInteriorReqDto reqDto) {
        return colorService.availableExteriorList(reqDto.getInteriorCode(), reqDto.getTrimCode(), reqDto.getCarCode());
    }

    /**
     * /cars/color-change?exteriorCode={code}&interiorCode={code}&trimCode={code}&optionCodes={a,c,v}
     */
//    @GetMapping("/color-change")
//    public
    @GetMapping("/checked-options")
    public CheckedOptionResDto checkedOptions(@Valid CheckedOptionsReqDto reqDto) {
        return colorService.checkedOptionResDto(reqDto.getModelId(), reqDto.getInteriorCode(), reqDto.getOptionCodes());
    }

}
