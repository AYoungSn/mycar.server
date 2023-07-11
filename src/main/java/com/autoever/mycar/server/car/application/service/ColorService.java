package com.autoever.mycar.server.car.application.service;


import com.autoever.mycar.server.car.adapter.adapter.out.persistence.ModelRepository;
import com.autoever.mycar.server.car.adapter.adapter.out.persistence.ToolTipsRepository;
import com.autoever.mycar.server.car.adapter.adapter.out.persistence.color.ExteriorRepository;
import com.autoever.mycar.server.car.adapter.adapter.out.persistence.color.InteriorRepository;
import com.autoever.mycar.server.car.dto.req.ColorChangeReqDto;
import com.autoever.mycar.server.car.dto.res.ChangeTrimResDto;
import com.autoever.mycar.server.car.dto.res.CheckedOptionResDto;
import com.autoever.mycar.server.car.dto.res.color.ExteriorListResDto;
import com.autoever.mycar.server.car.dto.res.color.InteriorListResDto;
import com.autoever.mycar.server.car.dto.res.trim.ChangeTrimInfoDto;
import com.autoever.mycar.server.car.dto.view.ModelResDto;
import com.autoever.mycar.server.car.dto.view.OptionInteriorDto;
import com.autoever.mycar.server.car.dto.view.TrimResDto;
import com.autoever.mycar.server.car.exception.ModelNotFoundException;
import com.autoever.mycar.server.car.adapter.adapter.out.persistence.color.ColorCombiRepository;
import com.autoever.mycar.server.car.adapter.adapter.out.persistence.options.OptionsRepository;
import com.autoever.mycar.server.car.dto.view.tooltips.TooltipsIdDto;
import com.autoever.mycar.server.car.domain.Options;
import com.autoever.mycar.server.car.domain.code.*;
import com.autoever.mycar.server.car.domain.color.ColorCombi;
import com.autoever.mycar.server.car.domain.color.Exterior;
import com.autoever.mycar.server.car.domain.color.Interior;
import com.autoever.mycar.server.car.exception.ExteriorNotFoundException;
import com.autoever.mycar.server.car.exception.InteriorNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ColorService {
    private final InteriorRepository interiorRepository;
    private final ExteriorRepository exteriorRepository;
    private final ColorCombiRepository colorCombiRepository;
    private final ModelRepository modelRepository;
    private final OptionsRepository optionsRepository;
    private final ToolTipsRepository toolTipsRepository;

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
                optionCodes.removeAll(optionInteriors.stream().map(OptionInteriorDto::getOptionCode).collect(Collectors.toList()));
                return new CheckedOptionResDto(false, optionCodes);
            }
        }
        return new CheckedOptionResDto(true, optionCodes);
    }

    public ChangeTrimResDto changeExteriorColor(ColorChangeReqDto reqDto) {
        // 변경하려는 exterior 가 현재 트림에서 선택 가능한 옵션인지
        List<ColorCombi> combis = colorCombiRepository.findAllByExteriorCodeAndModelId(reqDto.getExteriorCode().name(), reqDto.getModelId());
        // y -> 내장 색 변경 요청
        if (!combis.isEmpty()) {
            return new ChangeTrimResDto(true, null);
        } else {

            // n -> 트림 변경 요청
            // exterior 조합 조회
            Exterior exterior = exteriorRepository.findByCode(reqDto.getExteriorCode())
                    .orElseThrow(ExteriorNotFoundException::new);
            ChangeTrimInfoDto changeTrimInfoDto = getExteriorChangeTrimInfoDto(reqDto, exterior);
            List<Options> delOptions = getDelOptions(reqDto, changeTrimInfoDto);
            List<Options> addOptions = new ArrayList<>();
            return new ChangeTrimResDto(addOptions, delOptions, changeTrimInfoDto);
        }
    }

    // 선택한 색상조합이 트림 변경을 해야하는지 조회
    public ChangeTrimResDto changeInteriorColor(ColorChangeReqDto reqDto) {
        // 변경하려는 interior 가 현재 트림에서 선택 가능한 옵션인지
        List<ColorCombi> combis = colorCombiRepository.findAllByInteriorCodeAndModelId(reqDto.getInteriorCode().name(), reqDto.getModelId());
        // y -> 외장 색 변경 요청
        if (!combis.isEmpty()) {
            return new ChangeTrimResDto(null, true);
        } else {
            // n -> 트림 변경 요청
            Interior interior = interiorRepository.findByCode(reqDto.getInteriorCode()).orElseThrow(InteriorNotFoundException::new);
            ChangeTrimInfoDto changeTrimInfoDto = getInteriorChangeTrimInfoDto(reqDto, interior);
            // options
            List<Options> delOptions = getDelOptions(reqDto, changeTrimInfoDto);
            // 모델 변경 후에도 선택 가능한 옵션 조회
            List<Options> addOptions = new ArrayList<>();
            Optional<Options> op = optionsRepository.findByInteriorCode(interior.getCode().name());
            op.ifPresent(addOptions::add);
            return new ChangeTrimResDto(addOptions, delOptions, changeTrimInfoDto);
        }

    }
    // 모델 변경 후 제거되어야 하는 목록 조회
    private List<Options> getDelOptions(ColorChangeReqDto reqDto, ChangeTrimInfoDto changeTrimInfoDto) {
        List<OptionCode> delOptionCodes = reqDto.getOptionCodes();
        delOptionCodes.removeAll(optionsRepository.findAllByModelIdAndOptionCode(changeTrimInfoDto.getChangeModelId(), reqDto.getOptionCodes().stream().map(Enum::name).collect(Collectors.toList())));
        return optionsRepository.findAllByCodeIn(delOptionCodes);
    }

    private ChangeTrimInfoDto getExteriorChangeTrimInfoDto(ColorChangeReqDto reqDto, Exterior exterior) {
        ModelResDto beforeModel = modelRepository.findByModelId(reqDto.getModelId()).orElseThrow(ModelNotFoundException::new);
        return new ChangeTrimInfoDto(beforeModel, findExteriorChangeModel(reqDto.getModelId(), reqDto.getExteriorCode()), exterior);
    }

    private ChangeTrimInfoDto getInteriorChangeTrimInfoDto(ColorChangeReqDto reqDto, Interior interior) {
        ModelResDto beforeModel = modelRepository.findByModelId(reqDto.getModelId()).orElseThrow(ModelNotFoundException::new);
        return new ChangeTrimInfoDto(beforeModel, findInteriorChangeModel(reqDto.getModelId(), reqDto.getInteriorCode()), interior);
    }
    private TrimResDto findExteriorChangeModel(Long modelId, ExteriorCode exteriorCode) {
        // 변경하려는 외장, 내장 색 조합에서 가능한 trim 조회
        List<ColorCombi> colorCombis = colorCombiRepository.findAllByExteriorCode(exteriorCode);
        return getTrimResDto(modelId, colorCombis);
    }

    private TrimResDto findInteriorChangeModel(Long modelId, InteriorCode interiorCode) {
        // 변경하려는 외장, 내장 색 조합에서 가능한 trim 조회
        List<ColorCombi> colorCombis = colorCombiRepository.findAllByInteriorCode(interiorCode);
        System.out.println(colorCombis);
        return getTrimResDto(modelId, colorCombis);
    }

    private TrimResDto getTrimResDto(Long modelId, List<ColorCombi> colorCombis) {
        if (!colorCombis.isEmpty()) {
            // 현재 모델의 tooltip 조회
            TooltipsIdDto tooltipsId = toolTipsRepository.findToolTipsByModelId(modelId).orElseThrow();
            // 변경할 모델 조회
            if (tooltipsId.getGearboxId() == null || tooltipsId.getDrivingId() == null) {
                return modelRepository.findByTrimCodeAndTooltipId(colorCombis.get(0).getTrim_code().name(), tooltipsId.getEngineId()).orElseThrow(ModelNotFoundException::new);
            } else {
                return modelRepository.findByTrimCodeAndTooltipId(colorCombis.get(0).getTrim_code().name(), tooltipsId.getEngineId(), tooltipsId.getGearboxId(), tooltipsId.getDrivingId()).orElseThrow(ModelNotFoundException::new);
            }
        }
        return null;
    }
}