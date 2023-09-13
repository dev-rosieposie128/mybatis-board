package com.mybatis.boardProject.post.service;

import com.mybatis.boardProject.post.PostDTO;
import com.mybatis.boardProject.post.dao.PostDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    private final PostDAO postDAO;

    public PostServiceImpl(PostDAO postDAO) {
        this.postDAO = postDAO;
    }
    @Transactional
    public Long insertPost(PostDTO params) {
        postDAO.insertPost(params);
        return params.getPostId();
    }

    public PostDTO selectPost(Long id) {
        return postDAO.selectPost(id);
    }

    @Transactional
    public void updatePost(PostDTO params) {
        postDAO.updatePost(params);
    }

    @Transactional
    public void deletePost(Long id) {
        postDAO.deletePost(id);
    }

    public List<PostDTO> selectPostList() {
        return postDAO.selectPostList();
    }

    public int count() {
        return postDAO.count();
    }
}
