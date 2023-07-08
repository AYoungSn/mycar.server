package com.autoever.mycar.server.domain.car.exception;

import com.autoever.mycar.server.global.exception.ErrorCode;
import com.autoever.mycar.server.global.exception.common.NotFoundException;

public class InteriorNotFoundException extends NotFoundException {
    public InteriorNotFoundException() {
        super(ErrorCode.INTERIOR_NOT_FOUND.getMessage(), ErrorCode.INTERIOR_NOT_FOUND);
    }
}
