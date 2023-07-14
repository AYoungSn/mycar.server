package com.autoever.mycar.server.car.adapter.adapter.in.web;

import com.autoever.mycar.server.car.domain.code.CarCode;
import com.autoever.mycar.server.car.adapter.adapter.in.web.dto.req.ModelFilterReqDto;
import com.autoever.mycar.server.car.adapter.adapter.in.web.dto.res.ModelBasicInfoListDto;
import com.autoever.mycar.server.car.adapter.adapter.in.web.dto.res.ModelDetailResDto;
import com.autoever.mycar.server.car.adapter.adapter.in.web.dto.res.ToolTipListDto;
import com.autoever.mycar.server.car.adapter.adapter.in.web.dto.res.TrimListResDto;
import com.autoever.mycar.server.car.application.service.CarService;
import com.autoever.mycar.server.car.adapter.adapter.out.view.CarResDto;
import io.swagger.v3.oas.annotations.Operation;
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
    @Operation(summary = "차 종류 목록 조회(메뉴 목록 렌더링을 위한 API)")
    public List<CarResDto> getCarList() {
        return carService.getCarList();
    }

    @GetMapping("/model-filter")
    @Operation(summary = "선택 가능한 툴팁 목록 조회")
    public ToolTipListDto getToolTips(@Valid ModelFilterReqDto reqDto) {
        return carService.findToolTips(reqDto);
    }

    @GetMapping("/trims")
    @Operation(summary = "선택한 툴팁에 맞는 모델 리스트 조회")
    public TrimListResDto getTrims(@Valid ModelFilterReqDto reqDto) {
        return new TrimListResDto(carService.findModelsByToolTips(reqDto));
    }

    @GetMapping("/models/{modelId}/details")
    @Operation(summary = "내차만들기 페이지 초기 렌더링을 위한 API")
    public ModelDetailResDto getModelDetails(@PathVariable Long modelId) {
        return carService.myCarInit(modelId);
    }

    @GetMapping("/{carCode}/models")
    @Operation(summary = "트림 변경 모달에서 변경 가능한 모델 종류를 보여주기 위한 API")
    public ModelBasicInfoListDto getModelList(@PathVariable CarCode carCode) {
        return carService.findModelBasicInfo(carCode);
    }

    @GetMapping("/{carCode}/trims")
    @Operation(summary = "트림 변경 모달에서 모델 기본 이름 별로 선택 가능한 트림 목록 상세 조회")
    public TrimListResDto getTrimListByModelName(@PathVariable CarCode carCode, String modelBasicName) {
        return carService.findTrimListAndModelName(carCode, modelBasicName);
    }
}
