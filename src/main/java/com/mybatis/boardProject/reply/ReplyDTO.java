package com.mybatis.boardProject.reply;

import java.time.LocalDateTime;

public class ReplyDTO {
    private final Long replyId;
    private final Long postId;
    private String content;
    private final Long userId;
    private final Long nUserId;
    private final Long uPwd;
    private final LocalDateTime regDt;
    private LocalDateTime mdfDt;

    public ReplyDTO(Long replyId, Long postId, String content, Long userId, Long nUserId, Long uPwd, LocalDateTime regDt, LocalDateTime mdfDt) {
        this.replyId = replyId;
        this.postId = postId;
        this.content = content;
        this.userId = userId;
        this.nUserId = nUserId;
        this.uPwd = uPwd;
        this.regDt = regDt;
        this.mdfDt = mdfDt;
    }

    public Long getReplyId() {
        return replyId;
    }

    public Long getPostId() {
        return postId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getnUserId() {
        return nUserId;
    }

    public Long getuPwd() {
        return uPwd;
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
