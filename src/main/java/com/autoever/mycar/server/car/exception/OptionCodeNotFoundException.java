package com.autoever.mycar.server.car.exception;

import com.autoever.mycar.server.global.exception.ErrorCode;
import com.autoever.mycar.server.global.exception.common.NotFoundException;

public class OptionCodeNotFoundException extends NotFoundException {
    public OptionCodeNotFoundException() {
        super("존재하지 않는 옵션 코드입니다.", ErrorCode.OPTION_NOT_FOUND);
    }
}
