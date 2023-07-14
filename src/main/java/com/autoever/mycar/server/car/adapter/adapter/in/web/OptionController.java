package com.autoever.mycar.server.car.adapter.adapter.in.web;

import com.autoever.mycar.server.car.adapter.adapter.in.web.dto.req.options.TrimChangeReqDto;
import com.autoever.mycar.server.car.adapter.adapter.in.web.dto.res.options.*;
import com.autoever.mycar.server.car.application.service.OptionService;
import com.autoever.mycar.server.car.adapter.adapter.in.web.dto.req.options.ChangeOptionReqDto;
import com.autoever.mycar.server.car.adapter.adapter.in.web.dto.req.options.SelectedOptionsInfoReqDto;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;

@RestController
@RequestMapping("/cars/options")
@RequiredArgsConstructor
public class OptionController {
    private final OptionService optionService;
    @GetMapping("/disable")
    @Operation(summary = "현재 선택된 옵션에 따라 선택 불가능한 옵션 조회")
    public DisableOptionResDto disableOptions(@Valid SelectedOptionsInfoReqDto reqDto) {
        return optionService.disableOption(reqDto.getModelId(), reqDto.getOptionCodes());
    }
    @GetMapping("/enable")
    @Operation(summary = "현재 선택된 옵션에 따라 이제 선택 가능한 옵션 조회")
    public EnableOptionListResDto enableOptions(@Valid SelectedOptionsInfoReqDto reqDto) {
        return optionService.enableOption(reqDto.getModelId(), reqDto.getOptionCodes());
    }

    // 옵션 선택시 삭제되거나 같이 선택되어야 하는 옵션 조회
    @GetMapping("/change")
    @Operation(summary = "현재 선택된 옵션에 따라 같이 선택되거나 해제되어야 하는 옵션 조회")
    public ChangeOptionInfoDto checkChangeOption(@Valid ChangeOptionReqDto reqDto) {
        return optionService.changeCheckOption(reqDto.getModelId(), reqDto.getOptionCodes(), reqDto.getAddOption());
    }

    @GetMapping("/tuix")
    @Operation(summary = "현재 선택된 옵션에 따라 보여지는 현대 악세사리 옵션 목록 조회")
    public TuixOptionListResDto getTuixList(@Valid SelectedOptionsInfoReqDto reqDto) {
        return optionService.findTuixOptionList(reqDto.getModelId(), reqDto.getOptionCodes());
    }

    @GetMapping("/tuix/disable")
    @Operation(summary = "현재 선택된 옵션에 따라 선택 불가능한 현대 악세사리 옵션 목록 조회")
    public DisableOptionResDto tuixDisableOptionList(@Valid SelectedOptionsInfoReqDto reqDto) {
        return optionService.tuixDisableOption(reqDto.getModelId(), reqDto.getOptionCodes());
    }

    @GetMapping("/checked-interior")
    @Operation(summary = "현재 선택된 옵션 목록에 따라 선택되어야 하는 인테리어 조회")
    public CheckedInteriorResDto checkedInterior(@Valid SelectedOptionsInfoReqDto reqDto) {
        return optionService.checkedInterior(reqDto.getOptionCodes());
    }
    @GetMapping("/trim-change")
    @Operation(summary = "현재 선택된 옵션이 모델을 변경했을 때 선택 해제되는 옵션 목록 조회")
    public DisableOptionResDto trimChange(@Valid TrimChangeReqDto reqDto) {
        if (reqDto.getBeforeModelId().equals(reqDto.getAfterModelId())) {
            return new DisableOptionResDto(new ArrayList<>());
        }
        return optionService.changeTrim(reqDto.getAfterModelId(), reqDto.getOptionCodes());
    }
}
