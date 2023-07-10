package com.autoever.mycar.server.car.exception;

import com.autoever.mycar.server.global.exception.ErrorCode;
import com.autoever.mycar.server.global.exception.common.NotFoundException;

public class ModelNotFoundException extends NotFoundException {
    public ModelNotFoundException() {
        super(ErrorCode.MODEL_NOT_FOUND.getMessage(), ErrorCode.MODEL_NOT_FOUND);
    }
}
