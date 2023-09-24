package com.mybatis.boardProject.common.exception;

import com.mybatis.boardProject.common.code.StatusCode;

// 커스텀 익셉션 : 비지니스로직 예외처리에 사용
public class CustomException extends RuntimeException{
    private final StatusCode statusCode;
    public StatusCode getErrorCode() {
        return statusCode;
    }
    public CustomException(StatusCode statusCode) {
        this.statusCode = statusCode;
    }
}
