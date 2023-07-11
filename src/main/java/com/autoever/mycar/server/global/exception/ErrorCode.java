package com.autoever.mycar.server.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    INTERNAL_SERVER_ERR(500, "CM001","INTERNAL SERVER ERROR"),
    NOT_FOUND(404, "CM002", "NOT FOUND"),
    BAD_REQUEST(400, "CM003", "BAD REQUEST"),
    UNAUTHORIZED(401, "CM004", "UNAUTHORIZED"),
    METHOD_NOT_ALLOWED(405, "CM005", "METHOD NOT ALLOWED"),
    PAGE_NOT_FOUND(404, "CM006", "PAGE NOT FOUND"),
    VALID_FAILED(400, "CM007" , "Valid Test Failed."),
    BAD_ARGU(400, "CM008", "잘못된 argument 입니다."),
    MODEL_NOT_FOUND(404, "MO001", "존재하지 않는 모델입니다."),
    INTERIOR_NOT_FOUND(404, "I001", "존재하지 않는 interior 입니다."),
    EXTERIOR_NOT_FOUND(404, "E001", "존재하지 않는 exterior 입니다."),
    OPTION_NOT_FOUND(404, "O001", "존재하지 않는 option 입니다."),
    ;
    private int status;
    private String errCode;
    private String message;

    public void setMessage(String msg) {
        this.message = msg;
    }
}
