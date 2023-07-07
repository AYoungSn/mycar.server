package com.autoever.mycar.server.domain.car.service;


import com.autoever.mycar.server.domain.car.data.color.ExteriorRepository;
import com.autoever.mycar.server.domain.car.data.color.InteriorRepository;
import com.autoever.mycar.server.domain.car.dto.res.color.ExteriorListResDto;
import com.autoever.mycar.server.domain.car.dto.res.color.InteriorListResDto;
import com.autoever.mycar.server.domain.car.dto.res.color.InteriorResDto;
import com.autoever.mycar.server.domain.car.entity.code.CarCode;
import com.autoever.mycar.server.domain.car.entity.code.ExteriorCode;
import com.autoever.mycar.server.domain.car.entity.code.InteriorCode;
import com.autoever.mycar.server.domain.car.entity.code.TrimCode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ColorService {
    private final InteriorRepository interiorRepository;
    private final ExteriorRepository exteriorRepository;

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
}
