package com.mybatis.boardProject.common.dto;

import lombok.Builder;
import org.springframework.validation.FieldError;

import java.lang.reflect.Field;
import java.util.List;

@Builder
public class  ErrorResponse<T> {
    private int status;
    private String error;
    private String code;
    private String message;

    public int getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public ErrorResponse(String message) {
        this.message = message;
    }
    public ErrorResponse(int status, String error, String code, String message) {
        this.status = status;
        this.error = error;
        this.code = code;
        this.message = message;
    }
}
