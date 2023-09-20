package com.mybatis.boardProject.post.dto;

import java.time.LocalDateTime;

public class PostResponse {
    private final Long postId;
    private String title;
    private String content;
    private int viewCnt;
    private int replyCnt;
    private final long userId;
    private final long nUserId;
    private final long nPwd;
    private boolean delYn;
    private final LocalDateTime regDt;
    private LocalDateTime mdfDt;
    private final Long boardId;

    public PostResponse(Long postId, String title, String content, int viewCnt, int replyCnt, long userId, long nUserId, long nPwd, boolean delYn, LocalDateTime regDt, LocalDateTime mdfDt, Long boardId) {
        this.postId = postId;
        this.title = title;
        this.content = content;
        this.viewCnt = viewCnt;
        this.replyCnt = replyCnt;
        this.userId = userId;
        this.nUserId = nUserId;
        this.nPwd = nPwd;
        this.delYn = delYn;
        this.regDt = regDt;
        this.mdfDt = mdfDt;
        this.boardId = boardId;
    }

    public Long getPostId() {
        return postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getViewCnt() {
        return viewCnt;
    }

    public void setViewCnt(int viewCnt) {
        this.viewCnt = viewCnt;
    }

    public int getReplyCnt() {
        return replyCnt;
    }

    public void setReplyCnt(int replyCnt) {
        this.replyCnt = replyCnt;
    }

    public long getUserId() {
        return userId;
    }

    public long getnUserId() {
        return nUserId;
    }

    public long getnPwd() {
        return nPwd;
    }

    public boolean isDelYn() {
        return delYn;
    }

    public void setDelYn(boolean delYn) {
        this.delYn = delYn;
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

    public Long getBoardId() {
        return boardId;
    }
}
