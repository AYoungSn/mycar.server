package com.autoever.mycar.server.domain.car.exception;

import com.autoever.mycar.server.global.exception.ErrorCode;
import com.autoever.mycar.server.global.exception.common.NotFoundException;

public class ExteriorNotFoundException extends NotFoundException {
    public ExteriorNotFoundException() {
        super(ErrorCode.EXTERIOR_NOT_FOUND.getMessage(), ErrorCode.EXTERIOR_NOT_FOUND);
    }
}
