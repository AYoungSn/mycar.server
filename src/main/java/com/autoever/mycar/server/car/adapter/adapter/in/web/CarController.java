package com.autoever.mycar.server.car.adapter.adapter.in.web;

import com.autoever.mycar.server.car.domain.code.CarCode;
import com.autoever.mycar.server.car.adapter.adapter.in.web.dto.req.ModelFilterReqDto;
import com.autoever.mycar.server.car.adapter.adapter.in.web.dto.res.ModelBasicInfoListDto;
import com.autoever.mycar.server.car.adapter.adapter.in.web.dto.res.ModelDetailResDto;
import com.autoever.mycar.server.car.adapter.adapter.in.web.dto.res.ToolTipListDto;
import com.autoever.mycar.server.car.adapter.adapter.in.web.dto.res.TrimListResDto;
import com.autoever.mycar.server.car.application.service.CarService;
import com.autoever.mycar.server.car.adapter.adapter.out.view.CarResDto;
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

    @GetMapping("/{carCode}/models")
    public ModelBasicInfoListDto getModelList(@PathVariable CarCode carCode) {
        return carService.findModelBasicInfo(carCode);
    }

    @GetMapping("/{carCode}/trims")
    public TrimListResDto getTrimListByModelName(@PathVariable CarCode carCode, String modelBasicName) {
        return carService.findTrimListAndModelName(carCode, modelBasicName);
    }
}
