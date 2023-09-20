package com.mybatis.boardProject.post.service;

import com.mybatis.boardProject.post.dto.PostRequest;

import java.util.List;

public interface PostService {
    /**
     * 게시글 저장
     * @param params - 게시글 정보
     */
    public Long insertPost(PostRequest params);

    /**
     * 게시글 상세정보 조회
     * @param id - PK
     * @return 게시글 상세정보
     */
    PostRequest selectPost(Long id);

    /**
     * 게시글 수정
     * @param params - 게시글 정보
     */
    void updatePost(PostRequest params);

    /**
     * 게시글 삭제
     * @param id - PK
     */
    void deletePost(Long id);

    /**
     * 게시글 리스트 조회
     * @return 게시글 리스트
     */
    List<PostRequest> selectPostList();

    /**
     * 게시글 수 카운팅
     * @return 게시글 수
     */
    int count();
}
