package com.mybatis.boardProject.user.dto;

import org.springframework.lang.NonNull;

// 유저 수정시 요청 객체
public class UserUpdateRequest {
    private String pwd;
    private String name;
    private String email;
    public String getPwd() {
        return pwd;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public UserUpdateRequest() {
    }
}
