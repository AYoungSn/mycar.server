package com.autoever.mycar.server.domain.car.controller;

import com.autoever.mycar.server.domain.car.dto.req.ModelFilterReqDto;
import com.autoever.mycar.server.domain.car.dto.res.ModelDetailResDto;
import com.autoever.mycar.server.domain.car.dto.res.ToolTipListDto;
import com.autoever.mycar.server.domain.car.dto.res.TrimListResDto;
import com.autoever.mycar.server.domain.car.service.CarService;
import com.autoever.mycar.server.domain.car.dto.view.CarResDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @GetMapping
    public List<CarResDto> getCarList() {
        return carService.getCarList();
    }

    @GetMapping("/model-filter")
    public ToolTipListDto getToolTips(@Valid ModelFilterReqDto reqDto) {
        return carService.findToolTips(reqDto);
    }

    @GetMapping("/trims")
    public TrimListResDto getTrims(@Valid ModelFilterReqDto reqDto) {
        return new TrimListResDto(carService.findModelsByToolTips(reqDto));
    }

    @GetMapping("/models/{modelId}/details")
    public ModelDetailResDto getModelDetails(@PathVariable Long modelId) {
        return carService.myCarInit(modelId);
    }
}
