package com.mybatis.boardProject.common.dto;

import lombok.Builder;

@Builder
public class CommonResponse<T> {
    private Integer code;
    private String msg;
    private T body;

    public Integer getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
    public T getBody() {
        return body;
    }

    public CommonResponse(Integer code, String msg, T body) {
        this.code = code;
        this.msg = msg;
        this.body = body;
    }
}
