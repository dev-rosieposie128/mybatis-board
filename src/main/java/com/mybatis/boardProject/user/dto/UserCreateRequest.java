package com.mybatis.boardProject.user.dto;


import org.springframework.lang.NonNull;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

// 유저 생성시 요청 객체
public class UserCreateRequest {
    @NotEmpty(message = "아이디는 빈 값일 수 없습니다")
    private String loginId;
    @NotEmpty(message = "비밀번호는 빈 값일 수 없습니다")
    private String pwd;
    @NotEmpty(message = "이름은 빈 값일 수 없습니다")
    private String name;
    @NotEmpty
    @Email(message = "올바른 형식의 이메일 주소어야 합니다")
    private String email;

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

    public UserCreateRequest() {

    }
}
