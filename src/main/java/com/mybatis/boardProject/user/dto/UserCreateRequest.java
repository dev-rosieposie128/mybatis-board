package com.mybatis.boardProject.user.dto;


import org.springframework.lang.NonNull;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/**
 * DTO - Data Transaction Object 데이터 전송 객체이다
 * Request는 presentation에서 필요한 필드이다.
 * 로직을 갖지 않는 순수한 데이터 객체이며, getter와 setter 메소드 만을 갖는다.
 *
 * setter를 갖는 경우 가변객체가 될 것이고,
 * setter가 아닌 멤버 변수에 final을 사용하여, 생성자를 이용해 초기화를 하는 경우, 불변 객체로 활용할 수 있다
 */

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

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserCreateRequest() {
    }

    /*public UserCreateRequest(String loginId, String pwd, String name, String email) {
        this.loginId = loginId;
        this.pwd = pwd;
        this.name = name;
        this.email = email;
    }*/
}
