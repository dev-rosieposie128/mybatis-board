package com.mybatis.boardProject.user.dto;

public class UserLoginDto {
    private String loginId;
    private String pwd;

    public String getLoginId() {
        return loginId;
    }

    public String getPwd() {
        return pwd;
    }

    public UserLoginDto(String loginId, String pwd) {
        this.loginId = loginId;
        this.pwd = pwd;
    }
}
