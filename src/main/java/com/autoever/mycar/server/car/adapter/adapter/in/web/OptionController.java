package com.autoever.mycar.server.car.adapter.adapter.in.web;

import com.autoever.mycar.server.car.application.service.OptionService;
import com.autoever.mycar.server.car.dto.req.ChangeOptionReqDto;
import com.autoever.mycar.server.car.dto.req.SelectedOptionsInfoReqDto;
import com.autoever.mycar.server.car.dto.res.options.ChangeOptionInfoDto;
import com.autoever.mycar.server.car.dto.res.options.DisableOptionResDto;
import com.autoever.mycar.server.car.dto.res.options.EnableOptionListResDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/cars/options")
@RequiredArgsConstructor
public class OptionController {
    private final OptionService optionService;
    @GetMapping("/disable")
    public DisableOptionResDto disableOptions(@Valid SelectedOptionsInfoReqDto reqDto) {
        return optionService.disableOption(reqDto.getModelId(), reqDto.getOptionCodes());
    }
    @GetMapping("/enable")
    public EnableOptionListResDto enableOptions(@Valid SelectedOptionsInfoReqDto reqDto) {
        return optionService.enableOption(reqDto.getModelId(), reqDto.getOptionCodes());
    }

    // 옵션 선택시 삭제되거나 같이 선택되어야 하는 옵션 조회
    @GetMapping("/change")
    public ChangeOptionInfoDto checkChangeOption(@ModelAttribute @Valid ChangeOptionReqDto reqDto) {
        return optionService.changeCheckOption(reqDto.getModelId(), reqDto.getOptionCodes(), reqDto.getAddOption());
    }
}
