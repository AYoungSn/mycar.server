package com.autoever.mycar.server.car.adapter.in.web;

import com.autoever.mycar.server.car.adapter.in.web.dto.req.ModelFilterReqDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.req.ToolTipReqDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.res.ModelBasicInfoListDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.res.ModelDetailResDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.res.ToolTipListDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.res.TrimListResDto;
import com.autoever.mycar.server.car.adapter.out.view.CarResDto;
import com.autoever.mycar.server.car.adapter.out.view.ModelResDto;
import com.autoever.mycar.server.car.application.service.CarService;
import com.autoever.mycar.server.car.domain.code.CarCode;
import com.autoever.mycar.server.car.exception.ModelNotFoundException;
import com.autoever.mycar.server.global.exception.ErrorResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import java.util.List;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping
    @Operation(summary = "차 종류 목록 조회(메뉴 목록 렌더링을 위한 API)", responses = {
            @ApiResponse(responseCode = "200", description = "목록 조회 성공",
                    content = @Content(schema = @Schema(implementation = List.class)))
    })
    public List<CarResDto> getCarList() {
        return carService.getCarList();
    }

    @GetMapping("/model-filter")
    @Operation(summary = "선택 가능한 툴팁 목록 조회", responses = {
            @ApiResponse(responseCode = "200", description = "선택 가능한 툴팁 목록 조회 성공",
                    content = @Content(schema = @Schema(implementation = ToolTipListDto.class))),
            @ApiResponse(responseCode = "400", description = "요청 값이 잘못된 경우",
                    content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    })
    public ToolTipListDto getToolTips(@Valid @ParameterObject ToolTipReqDto reqDto) {
        return carService.findToolTips(reqDto);
    }

    @GetMapping("/trims")
    @Operation(summary = "선택한 툴팁에 맞는 모델 리스트 조회", responses = {
            @ApiResponse(responseCode = "200", description = "모델 리스트 조회 성공",
                    content = @Content(schema = @Schema(implementation = TrimListResDto.class))),
    })
    public TrimListResDto getTrims(@Valid @ParameterObject ModelFilterReqDto reqDto) {
        return new TrimListResDto(carService.findModelsByToolTips(reqDto));
    }

    @GetMapping("/models/{modelId}")
    @Operation(summary = "차량 모델 기본 정보 조회", responses = {
            @ApiResponse(responseCode = "200", description = "차량 모델 정보 조회 성공",
                    content = @Content(schema = @Schema(implementation = ModelResDto.class))),
            @ApiResponse(responseCode = "404", description = "존재하지 않는 모델 id",
                    content = @Content(schema
                            = @Schema(implementation = ModelNotFoundException.class)))
    })
    public ModelResDto getModelInfo(@PathVariable Long modelId) {
        return carService.getModelInfo(modelId);
    }

    @GetMapping("/models/{modelId}/details")
    @Operation(summary = "내 차 만들기 페이지 초기 렌더링을 위한 API", responses = {
            @ApiResponse(responseCode = "200", description = "차량 상세 정보 조회 성공",
                    content = @Content(schema = @Schema(implementation = ModelDetailResDto.class))),
            @ApiResponse(responseCode = "404", description = "존재하지 않는 모델 id",
                    content = @Content(schema
                            = @Schema(implementation = ModelNotFoundException.class)))
    })
    public ModelDetailResDto getModelDetails(@PathVariable Long modelId) {
        return carService.myCarInit(modelId);
    }

    @GetMapping("/{carCode}/models")
    @Operation(summary = "트림 변경 모달에서 변경 가능한 모델 종류를 보여주기 위한 API", responses = {
            @ApiResponse(responseCode = "200", description = "모델 이름 조회 성공",
                    content = @Content(schema
                            = @Schema(implementation = ModelBasicInfoListDto.class)))
    })
    public ModelBasicInfoListDto getModelList(@PathVariable CarCode carCode) {
        return carService.findModelBasicInfo(carCode);
    }

    @GetMapping("/{carCode}/trims")
    @Operation(summary = "트림 변경 모달에서 모델 기본 이름 별로 선택 가능한 트림 목록 상세 조회", responses = {
            @ApiResponse(responseCode = "200", description = "트림 목록 상세 조회",
                    content = @Content(schema = @Schema(implementation = TrimListResDto.class)))
    })
    public TrimListResDto getTrimListByModelName(
            @PathVariable CarCode carCode,
            String modelBasicName) {
        return carService.findTrimListAndModelName(carCode, modelBasicName);
    }
}
