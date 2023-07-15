package com.autoever.mycar.server.car.application.service;

import com.autoever.mycar.server.car.adapter.in.web.dto.res.options.ChangeOptionInfoDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.res.options.CheckedInteriorResDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.res.options.DisableOptionResDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.res.options.EnableOptionListResDto;
import com.autoever.mycar.server.car.adapter.in.web.dto.res.options.TuixOptionListResDto;
import com.autoever.mycar.server.car.adapter.out.persistence.ModelRepository;
import com.autoever.mycar.server.car.adapter.out.persistence.OptionInteriorRepository;
import com.autoever.mycar.server.car.adapter.out.persistence.options.OptionsRepository;
import com.autoever.mycar.server.car.domain.Options;
import com.autoever.mycar.server.car.domain.code.OptionCode;
import com.autoever.mycar.server.car.domain.code.TrimCode;
import com.autoever.mycar.server.car.domain.options.OptionInterior;
import com.autoever.mycar.server.car.exception.ModelNotFoundException;
import com.autoever.mycar.server.car.exception.OptionCodeNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OptionService {

    private final OptionsRepository optionsRepository;
    private final ModelRepository modelRepository;
    private final OptionInteriorRepository optionInteriorRepository;

    public DisableOptionResDto disableOption(Long modelId, List<OptionCode> optionCodes) {
        // del: 선택된 option_code 와 중복으로 선택이 불가능한 옵션 조회 duplicate_option
        // 현재 선택된 옵션 바탕으로 보여지는 옵션 목록 조회
        TrimCode trimCode = modelRepository.findByModelId(modelId)
                .orElseThrow(ModelNotFoundException::new).getTrimCode();
        List<Options> options = optionsRepository
                .findDuplicateAllByOptionCodeIn(modelId, optionCodes);
        options.addAll(
                optionsRepository
                        .findAllDependencyOptionByDependencyCodeNotIn(trimCode, optionCodes));
        return new DisableOptionResDto(options);
    }

    public EnableOptionListResDto enableOption(Long modelId, List<OptionCode> optionCodes) {
        // trim_code를 기준으로,
        // add: 선택된 option_code가 dependency_option.option_code 에 포함되는 것
        TrimCode trimCode = modelRepository.findByModelId(modelId)
                .orElseThrow(ModelNotFoundException::new).getTrimCode();
        List<Options> dependencyOptions = optionsRepository
                .findAllDetailDependencyOptionByOptionCodeIn(trimCode, optionCodes);
        return new EnableOptionListResDto(dependencyOptions);
    }

    public ChangeOptionInfoDto changeCheckOption(Long modelId, List<OptionCode> optionCodes,
            OptionCode addOption) {
        TrimCode trimCode = modelRepository.findByModelId(modelId)
                .orElseThrow(ModelNotFoundException::new).getTrimCode();
        // dependency_option -> add option
        List<Options> add;
        List<Options> del = new ArrayList<>();
        add = optionsRepository.findAllDependencyDetailOptionByOptionCode(trimCode, addOption);
        if (!add.isEmpty()) {
            add.add(optionsRepository.findByCode(addOption)
                    .orElseThrow(OptionCodeNotFoundException::new));
        } else {
            // duplicate_option -> del option
            del = optionsRepository.findDuplicateAllByOptionCode(addOption);
            if (!del.isEmpty()) {
                add = new ArrayList<>();
                add.add(optionsRepository.findByCode(addOption)
                        .orElseThrow(OptionCodeNotFoundException::new));
            }
        }
        return new ChangeOptionInfoDto(del, add);
    }

    public TuixOptionListResDto findTuixOptionList(Long modelId, List<OptionCode> optionCodes) {
        TrimCode trimCode = modelRepository.findByModelId(modelId)
                .orElseThrow(ModelNotFoundException::new).getTrimCode();
        // default 목록 조회
        List<Options> options = optionsRepository.findTuixOptionsAllByModelId(modelId);
        // dependency 로 추가될 목록 조회
        options.addAll(optionsRepository.findAllDependencyOptionByOptionCodeAndCategoryDetailNotIn(
                trimCode, optionCodes));
        options.removeAll(optionsRepository.findDelOptions(optionCodes));
        return new TuixOptionListResDto(options);
    }

    public DisableOptionResDto tuixDisableOption(Long modelId, List<OptionCode> optionCodes) {
        return new DisableOptionResDto(
                optionsRepository.findDuplicateAllByOptionCodeNotIn(optionCodes));
    }

    public CheckedInteriorResDto checkedInterior(List<OptionCode> optionCodes) {
        List<OptionInterior> interiors = optionInteriorRepository
                .findAllByOptionCodeIn(optionCodes);
        return new CheckedInteriorResDto(interiors.size() > 0,
                interiors.stream().map((OptionInterior::getInteriorCode))
                        .collect(Collectors.toList()));
    }

    public DisableOptionResDto changeTrim(Long afterModelId, List<OptionCode> optionCodes) {
        // 변경하려는 모델에서 선택할수 없는 옵션 목록 제거
        List<Options> curOptions = optionsRepository.findAllByCodeIn(optionCodes);
        List<Options> afterModelOptions = optionsRepository.findAllByModelId(afterModelId);
        curOptions.removeAll(afterModelOptions);
        return new DisableOptionResDto(curOptions);
    }
}
