package com.mybatis.boardProject.authority.dto;

import java.time.LocalDateTime;

public class AuthorityRequest {
    private final Long authId;
    private String authNm;
    private boolean useYn;
    private int level;
    private final LocalDateTime regDt;
    private LocalDateTime mdfDt;

    public AuthorityRequest(Long authId, String authNm, boolean useYn, int level, LocalDateTime regDt, LocalDateTime mdfDt) {
        this.authId = authId;
        this.authNm = authNm;
        this.useYn = useYn;
        this.level = level;
        this.regDt = regDt;
        this.mdfDt = mdfDt;
    }

    public Long getAuthId() {
        return authId;
    }

    public String getAuthNm() {
        return authNm;
    }

    public void setAuthNm(String authNm) {
        this.authNm = authNm;
    }

    public boolean isUseYn() {
        return useYn;
    }

    public void setUseYn(boolean useYn) {
        this.useYn = useYn;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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
}
