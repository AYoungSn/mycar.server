package com.autoever.mycar.server.domain.car.application.service;


import com.autoever.mycar.server.domain.car.adapter.out.persistence.ModelRepository;
import com.autoever.mycar.server.domain.car.adapter.out.persistence.color.ExteriorRepository;
import com.autoever.mycar.server.domain.car.adapter.out.persistence.color.InteriorRepository;
import com.autoever.mycar.server.domain.car.adapter.out.persistence.options.OptionsRepository;
import com.autoever.mycar.server.domain.car.dto.res.CheckedOptionResDto;
import com.autoever.mycar.server.domain.car.dto.res.color.ExteriorListResDto;
import com.autoever.mycar.server.domain.car.dto.res.color.InteriorListResDto;
import com.autoever.mycar.server.domain.car.dto.view.OptionInteriorDto;
import com.autoever.mycar.server.domain.car.entity.Options;
import com.autoever.mycar.server.domain.car.entity.code.*;
import com.autoever.mycar.server.domain.car.entity.color.Interior;
import com.autoever.mycar.server.domain.car.exception.ModelNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OptionService {
    private final InteriorRepository interiorRepository;
    private final ExteriorRepository exteriorRepository;
    private final ModelRepository modelRepository;
    private final OptionsRepository optionsRepository;

    public InteriorListResDto availableInteriorList(ExteriorCode exteriorCode, TrimCode trimCode, CarCode carCode) {
        InteriorListResDto result = new InteriorListResDto(interiorRepository.findAllByCarCode(carCode.name()));
        if (exteriorCode == null) {
            result.choiceCheck(interiorRepository.findAllByTrimCode(trimCode.name()));
        } else {
            result.choiceCheck(interiorRepository.findAllByExteriorCodeAndTrimCode(exteriorCode.name(), trimCode.name()));
        }
        return result;
    }

    public ExteriorListResDto availableExteriorList(InteriorCode interiorCode, TrimCode trimCode, CarCode carCode) {
        ExteriorListResDto result = new ExteriorListResDto(exteriorRepository.findAllByCarCode(carCode.name()));
        if (interiorCode == null) {
            result.choiceCheck(exteriorRepository.findAllByTrimCode(trimCode.name()));
        } else {
            result.choiceCheck(exteriorRepository.findAllByInteriorCodeAndTrimCode(interiorCode.name(), trimCode.name()));
        }
        return result;
    }

    public CheckedOptionResDto checkedOptionResDto(Long modelId, InteriorCode interiorCode, List<OptionCode> optionCodes) {
        Set<OptionCode> optionsSet = new HashSet<>(optionCodes);
        // 선택한 인테리어 색상 -> 옵션 추가, 삭제
        Optional<Options> options = optionsRepository.findByInteriorCode(interiorCode.name());
        options.ifPresent(value -> optionsSet.add(value.getCode()));
        if (optionsSet.size() > optionCodes.size()) {
            return new CheckedOptionResDto(false, new ArrayList<>(optionsSet));
        }
        // 색상 변경으로 옵션 선택 해제해야하는 경우
        List<OptionInteriorDto> optionInteriors = interiorRepository.findAllByOptionCode(optionCodes.stream().map(Enum::name).collect(Collectors.toList()));
        if (!optionInteriors.isEmpty()) {
            boolean check = false;
            for (int i = 0; i < optionInteriors.size(); i++) {
                if (optionInteriors.get(i).getInteriorCode().equals(interiorCode)) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                for (OptionInteriorDto dto : optionInteriors) {
                    for (OptionCode optionCode: optionCodes) {
                        if (dto.getOptionCode().equals(optionCode)) {
                            optionCodes.remove(optionCode);
                            break;
                        }
                    }
                }
                return new CheckedOptionResDto(false, optionCodes);
            }
        }
        return new CheckedOptionResDto(true, optionCodes);
    }
    // 선택한 옵션 -> 인테리어 변경, 유지
}
