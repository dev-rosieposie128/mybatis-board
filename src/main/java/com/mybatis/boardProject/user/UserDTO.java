package com.mybatis.boardProject.user;

import java.time.LocalDateTime;

public class UserDTO {

    private final Long userId;
    private final Long loginId;
    private String pwd;
    private String name;
    private String email;
    private boolean useYn;
    private final LocalDateTime regDt;
    private LocalDateTime mdfDt;
    private final long authId;

    public UserDTO(Long userId, Long loginId, String pwd, String name, String email, boolean useYn, LocalDateTime regDt, LocalDateTime mdfDt, long authId) {
        this.userId = userId;
        this.loginId = loginId;
        this.pwd = pwd;
        this.name = name;
        this.email = email;
        this.useYn = useYn;
        this.regDt = regDt;
        this.mdfDt = mdfDt;
        this.authId = authId;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getLoginId() {
        return loginId;
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

    public boolean isUseYn() {
        return useYn;
    }

    public void setUseYn(boolean useYn) {
        this.useYn = useYn;
    }

    public LocalDateTime getRegDt() {
        return regDt;
    }

    public LocalDateTime getMdfDt() {
        return mdfDt;
    }

    public void setMdfDt(LocalDateTime mdfDt) {
        this.mdfDt = mdfDt;
    }

    public long getAuthId() {
        return authId;
    }
}
