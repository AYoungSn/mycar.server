package com.autoever.mycar.server.car.application.service;

import com.autoever.mycar.server.car.adapter.adapter.out.persistence.ModelRepository;
import com.autoever.mycar.server.car.adapter.adapter.out.persistence.options.OptionsRepository;
import com.autoever.mycar.server.car.domain.Options;
import com.autoever.mycar.server.car.domain.code.OptionCode;
import com.autoever.mycar.server.car.domain.code.TrimCode;
import com.autoever.mycar.server.car.dto.res.options.ChangeOptionInfoDto;
import com.autoever.mycar.server.car.dto.res.options.DisableOptionResDto;
import com.autoever.mycar.server.car.dto.res.options.EnableOptionListResDto;
import com.autoever.mycar.server.car.exception.ModelNotFoundException;
import com.autoever.mycar.server.car.exception.OptionCodeNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OptionService {
    private final OptionsRepository optionsRepository;
    private final ModelRepository modelRepository;
    public DisableOptionResDto disableOption(Long modelId, List<OptionCode> optionCodes) {
        // del: 선택된 option_code 와 중복으로 선택이 불가능한 옵션 조회 duplicate_option
        // 현재 선택된 옵션 바탕으로 보여지는 옵션 목록 조회
        List<Options> showOptions = optionsRepository.findDetailOptionsAllByModelId(modelId);
        List<Options> options = optionsRepository.findDuplicateAllByOptionCodeIn(optionCodes.stream().map(Enum::name).collect(Collectors.toList()));
        return new DisableOptionResDto(options);
    }
    public EnableOptionListResDto enableOption(Long modelId, List<OptionCode> optionCodes) {
        // trim_code를 기준으로,
        // add: 선택된 option_code가 dependency_option.option_code 에 포함되는 것
        TrimCode trimCode = modelRepository.findByModelId(modelId).orElseThrow(ModelNotFoundException::new).getTrimCode();
//        List<Options> showOptions = optionsRepository.findDetailOptionsAllByModelId(modelId);
        List<Options> dependencyOptions = optionsRepository.findAllDependencyDetailOptionByOptionCodeIn(trimCode.name(), optionCodes.stream().map(Enum::name).collect(Collectors.toList()));
        return new EnableOptionListResDto(dependencyOptions);
    }
    public ChangeOptionInfoDto changeCheckOption(Long modelId, List<OptionCode> optionCodes, OptionCode addOption) {
        TrimCode trimCode = modelRepository.findByModelId(modelId).orElseThrow(ModelNotFoundException::new).getTrimCode();
        // dependency_option -> add option
        List<Options> add, del = new ArrayList<>();
        add = optionsRepository.findAllDependencyDetailOptionByOptionCode(trimCode.name(), addOption.name());
        if (!add.isEmpty()) {
            add.add(optionsRepository.findByCode(addOption).orElseThrow(OptionCodeNotFoundException::new));
        }else {
            // duplicate_option -> del option
            del = optionsRepository.findDuplicateAllByOptionCode(addOption.name());
            if (!del.isEmpty()) {
                add = new ArrayList<>();
                add.add(optionsRepository.findByCode(addOption).orElseThrow(OptionCodeNotFoundException::new));
            }
        }
        return new ChangeOptionInfoDto(del, add);
    }
}
