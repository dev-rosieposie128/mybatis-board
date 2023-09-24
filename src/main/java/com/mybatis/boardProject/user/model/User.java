package com.mybatis.boardProject.user.model;
import lombok.Builder;
import java.util.Date;

@Builder
public class User {
    private Long userId;
    private String loginId;
    private String pwd;
    private String name;
    private String email;
    private Long authId;
    private Date regDt;
    private Date mdfDt;

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

    public Date getRegDt() {
        return regDt;
    }

    public void setRegDt(Date regDt) {
        this.regDt = regDt;
    }

    public Date getMdfDt() {
        return mdfDt;
    }

    public void setMdfDt(Date mdfDt) {
        this.mdfDt = mdfDt;
    }

    public Long getAuthId() {
        return authId;
    }
    public void setAuthId(Long authId) {

        this.authId = authId;
    }

    public User(Long userId, String loginId, String pwd, String name, String email, Long authId, Date regDt, Date mdfDt) {
        this.userId = userId;
        this.loginId = loginId;
        this.pwd = pwd;
        this.name = name;
        this.email = email;
        this.authId = authId;
        this.regDt = regDt;
        this.mdfDt = mdfDt;
    }
}
