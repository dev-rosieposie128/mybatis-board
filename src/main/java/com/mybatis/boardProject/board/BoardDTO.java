package com.mybatis.boardProject.board;

import java.time.LocalDateTime;

public class BoardDTO {
    private final Long boardId;
    private String boardNm;
    private String boardDesc;
    private boolean useYn;
    private final Long authId;
    private final LocalDateTime regDt;
    private LocalDateTime mdfDt;

    public BoardDTO(Long boardId, String boardNm, String boardDesc, boolean useYn, Long authId, LocalDateTime regDt, LocalDateTime mdfDt) {
        this.boardId = boardId;
        this.boardNm = boardNm;
        this.boardDesc = boardDesc;
        this.useYn = useYn;
        this.authId = authId;
        this.regDt = regDt;
        this.mdfDt = mdfDt;
    }

    public Long getBoardId() {
        return boardId;
    }

    public String getBoardNm() {
        return boardNm;
    }

    public void setBoardNm(String boardNm) {
        this.boardNm = boardNm;
    }

    public String getBoardDesc() {
        return boardDesc;
    }

    public void setBoardDesc(String boardDesc) {
        this.boardDesc = boardDesc;
    }

    public boolean isUseYn() {
        return useYn;
    }

    public void setUseYn(boolean useYn) {
        this.useYn = useYn;
    }

    public Long getAuthId() {
        return authId;
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
