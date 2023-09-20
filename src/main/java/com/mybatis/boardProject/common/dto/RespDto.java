package com.mybatis.boardProject.common.dto;

public class RespDto<T> {
    private Integer code; // 1정상, -1실패
    private String msg; // 통신에 대한 결과 메시지 담기
    private T body; // body가 메서드마다 다르므로 제네릭 사용

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public RespDto(Integer code, String msg, T body) {
        this.code = code;
        this.msg = msg;
        this.body = body;
    }
}
