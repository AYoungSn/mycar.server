package com.autoever.mycar.server.car.adapter.in.web;

import com.autoever.mycar.server.car.adapter.in.web.dto.req.ColorChangeReqDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.req.SelectedExteriorReqDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.req.SelectedInteriorReqDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.req.options.CheckedOptionsInteriorReqDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.res.CheckedOptionResDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.res.color.ExteriorListResDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.res.color.InteriorListResDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.res.trim.ChangeTrimResDto;
import com.autoever.mycar.server.car.application.service.ColorService;
import io.swagger.v3.oas.annotations.Operation;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class ColorController {

    private final ColorService colorService;

    @GetMapping("/interior")
    @Operation(summary = "선택된 exterior code 에 따라 선택 가능한 interior 목록 조회")
    public InteriorListResDto availableInteriorList(@Valid SelectedExteriorReqDto reqDto) {
        return colorService.availableInteriorList(
                reqDto.getExteriorCode(), reqDto.getTrimCode(), reqDto.getCarCode());
    }

    @GetMapping("/exterior")
    @Operation(summary = "선택된 interior 에 따라 선택 가능한 exterior 목록 조회")
    public ExteriorListResDto availableExteriorList(@Valid SelectedInteriorReqDto reqDto) {
        return colorService.availableExteriorList(
                reqDto.getInteriorCode(), reqDto.getTrimCode(), reqDto.getCarCode());
    }

    @GetMapping("/color-change")
    @Operation(summary = "현재 선택한 외장 & 내장 색 조합이 현재 트림에서 선택 가능한 조합인지 조회")
    public ChangeTrimResDto colorChange(@Valid ColorChangeReqDto reqDto) {
        if (!reqDto.getBeforeExteriorCode().equals(reqDto.getExteriorCode())) {
            return colorService.changeExteriorColor(reqDto);
        }
        return colorService.changeInteriorColor(reqDto);
    }

    @GetMapping("/checked-options")
    @Operation(summary = "선택한 색상에 따라 선택되어야 하는 옵션 조회")
    public CheckedOptionResDto checkedOptions(@Valid CheckedOptionsInteriorReqDto reqDto) {
        return colorService.checkedOption(
                reqDto.getModelId(), reqDto.getInteriorCode(), reqDto.getOptionCodes());
    }

}
