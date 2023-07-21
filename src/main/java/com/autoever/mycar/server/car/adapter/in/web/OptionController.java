package com.autoever.mycar.server.car.adapter.in.web;

import com.autoever.mycar.server.car.adapter.in.web.dto.req.options.ChangeOptionReqDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.req.options.SelectedOptionsInfoReqDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.req.options.TrimChangeReqDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.req.options.TuixCheckOptionsReqDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.res.options.ChangeOptionInfoDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.res.options.CheckedInteriorResDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.res.options.DisableOptionResDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.res.options.EnableOptionListResDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.res.options.TuixOptionListResDto;
import com.autoever.mycar.server.car.application.service.OptionService;
import com.autoever.mycar.server.global.exception.ErrorResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import java.util.ArrayList;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars/options")
@RequiredArgsConstructor
public class OptionController {

    private final OptionService optionService;

    @GetMapping("/disable")
    @Operation(summary = "현재 선택된 옵션에 따라 선택 불가능한 옵션 조회", responses = {
            @ApiResponse(responseCode = "200", description = "선택 불가능으로 표시할 옵션 목록 조회 성공",
                    content = @Content(schema
                            = @Schema(implementation = DisableOptionResDto.class))),
            @ApiResponse(responseCode = "400", description = "요청 값이 잘못된 경우",
                    content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    })
    public DisableOptionResDto disableOptions(
            @Valid @ParameterObject SelectedOptionsInfoReqDto reqDto) {
        return optionService.disableOption(reqDto.getModelId(), reqDto.getOptionCodes());
    }

    @GetMapping("/enable")
    @Operation(summary = "현재 선택된 옵션에 따라 이제 선택 가능한 옵션 조회", responses = {
            @ApiResponse(responseCode = "200", description = "선택 가능으로 표시할 옵션 목록 조회 성공",
                    content = @Content(schema
                            = @Schema(implementation = EnableOptionListResDto.class))),
            @ApiResponse(responseCode = "400", description = "요청 값이 잘못된 경우",
                    content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "404", description = "model id 를 찾을 수 없는 경우",
                    content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    })
    public EnableOptionListResDto enableOptions(
            @Valid @ParameterObject SelectedOptionsInfoReqDto reqDto) {
        return optionService.enableOption(reqDto.getModelId(), reqDto.getOptionCodes());
    }

    // 옵션 선택시 삭제되거나 같이 선택되어야 하는 옵션 조회
    @GetMapping("/change")
    @Operation(summary = "현재 선택된 옵션에 따라 같이 선택되거나 해제되어야 하는 옵션 조회", responses = {
            @ApiResponse(responseCode = "200", description = "같이 선택/해제되어야 하는 옵션 목록 조회 성공",
                    content = @Content(schema
                            = @Schema(implementation = ChangeOptionInfoDto.class))),
            @ApiResponse(responseCode = "400", description = "요청 값이 잘못된 경우",
                    content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "404",
                    description = "model id, option code 를 찾을 수 없는 경우",
                    content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    })
    public ChangeOptionInfoDto checkChangeOption(
            @Valid @ParameterObject ChangeOptionReqDto reqDto) {
        return optionService.changeCheckOption(
                reqDto.getModelId(), reqDto.getOptionCodes(), reqDto.getAddOption());
    }

    @GetMapping("/tuix")
    @Operation(summary = "현재 선택된 옵션에 따라 보여지는 현대 악세사리 옵션 목록 조회", responses = {
            @ApiResponse(responseCode = "200", description = "현대 악세사리 옵션 목록 조회 성공",
                    content = @Content(schema
                            = @Schema(implementation = TuixOptionListResDto.class))),
            @ApiResponse(responseCode = "400", description = "요청 값이 잘못된 경우",
                    content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "404", description = "model id 를 찾을 수 없는 경우",
                    content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    })
    public TuixOptionListResDto getTuixList(
            @Valid @ParameterObject SelectedOptionsInfoReqDto reqDto) {
        return optionService.findTuixOptionList(reqDto.getModelId(), reqDto.getOptionCodes());
    }

    @GetMapping("/tuix-check")
    @Operation(summary = "현재 선택해제 하려는 옵션에 종속된 tuix 옵션을 조회", responses = {
            @ApiResponse(responseCode = "200", description = "tuix 옵션 목록 조회 성공",
                    content = @Content(schema
                            = @Schema(implementation = TuixOptionListResDto.class))),
            @ApiResponse(responseCode = "404", description = "model id 를 찾을 수 없는 경우",
                    content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    })
    public TuixOptionListResDto tuixCheck(
            @Valid @ParameterObject TuixCheckOptionsReqDto reqDto) {
        return optionService.tuixDelOption(reqDto.getOptionCode(),
                reqDto.getTuixOptionCodes());
    }

    @GetMapping("/tuix/disable")
    @Operation(summary = "현재 선택된 옵션에 따라 선택 불가능한 현대 악세사리 옵션 목록 조회", responses = {
            @ApiResponse(responseCode = "200", description = "현대 악세사리 옵션 선택 불가 목록 조회 성공",
                    content = @Content(schema
                            = @Schema(implementation = DisableOptionResDto.class))),
            @ApiResponse(responseCode = "400", description = "요청 값이 잘못된 경우",
                    content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
    })
    public DisableOptionResDto tuixDisableOptionList(
            @Valid @ParameterObject SelectedOptionsInfoReqDto reqDto) {
        return optionService.tuixDisableOption(reqDto.getModelId(), reqDto.getOptionCodes());
    }

    @GetMapping("/checked-interior")
    @Operation(summary = "현재 선택된 옵션 목록에 따라 선택되어야 하는 인테리어 조회", responses = {
            @ApiResponse(responseCode = "200", description = "선택되어야 하는 인테리어 조회 성공",
                    content = @Content(schema
                            = @Schema(implementation = CheckedInteriorResDto.class))),
            @ApiResponse(responseCode = "400", description = "요청 값이 잘못된 경우",
                    content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
    })
    public CheckedInteriorResDto checkedInterior(
            @Valid @ParameterObject SelectedOptionsInfoReqDto reqDto) {
        return optionService.checkedInterior(reqDto.getOptionCodes(), reqDto.getModelId());
    }

    @GetMapping("/trim-change")
    @Operation(summary = "현재 선택된 옵션이 모델을 변경했을 때 선택 해제되는 옵션 목록 조회", responses = {
            @ApiResponse(responseCode = "200", description = "모델을 변경했을 때 선택 해제되는 옵션 조회 성공",
                    content = @Content(schema
                            = @Schema(implementation = DisableOptionResDto.class))),
            @ApiResponse(responseCode = "400", description = "요청 값이 잘못된 경우",
                    content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
    })
    public DisableOptionResDto trimChange(@Valid @ParameterObject TrimChangeReqDto reqDto) {
        if (reqDto.getBeforeModelId().equals(reqDto.getAfterModelId())) {
            return new DisableOptionResDto(new ArrayList<>());
        }
        return optionService.changeTrim(reqDto.getAfterModelId(), reqDto.getOptionCodes());
    }
}
