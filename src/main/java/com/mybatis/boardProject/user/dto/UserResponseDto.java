package com.mybatis.boardProject.user.dto;
import com.mybatis.boardProject.user.model.User;
import java.util.Date;
public class UserResponseDto {
    /*private User user;
    public UserResponseDto(User user) {
        this.user = user;
    }
    public Long getUserId(){return this.user.getUserId();}
    public String getLoginId(){return this.user.getLoginId();}
    public String getPwd(){return this.user.getPwd();}
    public String getName(){return this.user.getName();}
    public String getEmail(){return this.user.getEmail();}
    public Long getAuthId(){return this.user.getAuthId();}
    public Date getRegDt(){return this.user.getRegDt();}
    public Date getMdfDt(){return this.user.getMdfDt();}*/
    private Long userId;
    private String loginId;
    private String pwd;
    private String name;
    private String email;
    private Long authId;
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getLoginId() {
        return loginId;
    }
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Long getAuthId() {
        return authId;
    }
    public void setAuthId(Long authId) {
        this.authId = authId;
    }
    public UserResponseDto(Long userId, String loginId, String pwd, String name, String email, Long authId) {
        this.userId = userId;
        this.loginId = loginId;
        this.pwd = pwd;
        this.name = name;
        this.email = email;
        this.authId = authId;
    }
}
