package com.autoever.mycar.server.domain.car.controller;

import com.autoever.mycar.server.domain.car.dto.res.color.ExteriorListResDto;
import com.autoever.mycar.server.domain.car.dto.res.color.InteriorListResDto;
import com.autoever.mycar.server.domain.car.entity.code.CarCode;
import com.autoever.mycar.server.domain.car.entity.code.ExteriorCode;
import com.autoever.mycar.server.domain.car.entity.code.InteriorCode;
import com.autoever.mycar.server.domain.car.entity.code.TrimCode;
import com.autoever.mycar.server.domain.car.service.ColorService;
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
    public InteriorListResDto availableInteriorList(ExteriorCode exteriorCode, TrimCode trimCode, CarCode carCode) {
        return colorService.availableInteriorList(exteriorCode, trimCode, carCode);
    }

    @GetMapping("/exterior")
    public ExteriorListResDto availableExteriorList(InteriorCode interiorCode, TrimCode trimCode, CarCode carCode) {
        return colorService.availableExteriorList(interiorCode, trimCode, carCode);
    }

}
