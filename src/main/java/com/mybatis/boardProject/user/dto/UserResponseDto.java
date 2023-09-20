package com.mybatis.boardProject.user.dto;

import java.util.Date;
public class UserResponseDto {
    private Long userId;
    private String loginId;
    private String pwd;
    private String name;
    private String email;
    private Long authId;

    public Long getUserId() {
        return userId;
    }

    public String getLoginId() {
        return loginId;
    }

    public String getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Long getAuthId() {
        return authId;
    }
}
