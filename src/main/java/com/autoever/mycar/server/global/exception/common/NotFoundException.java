package com.autoever.mycar.server.global.exception.common;

import com.autoever.mycar.server.global.exception.ErrorCode;
import lombok.Getter;

@Getter
public class NotFoundException extends RuntimeException {

    private ErrorCode errorCode;

    public NotFoundException(String message, ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
        this.errorCode.setMessage(message);
    }
}
