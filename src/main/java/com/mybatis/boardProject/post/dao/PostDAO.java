package com.mybatis.boardProject.post.dao;

import com.mybatis.boardProject.post.PostDTO;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface PostDAO {

    /**
     * 게시글 저장
     * @param params - 게시글 정보
     */
    public void insertPost(PostDTO params);

    /**
     * 게시글 상세정보 조회
     * @param id - PK
     * @return 게시글 상세정보
     */
    PostDTO selectPost(Long id);

    /**
     * 게시글 수정
     * @param params - 게시글 정보
     */
    void updatePost(PostDTO params);

    /**
     * 게시글 삭제
     * @param id - PK
     */
    void deletePost(Long id);

    /**
     * 게시글 리스트 조회
     * @return 게시글 리스트
     */
    List<PostDTO> selectPostList();

    /**
     * 게시글 수 카운팅
     * @return 게시글 수
     */
    int count();
}
