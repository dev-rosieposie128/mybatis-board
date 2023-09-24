package com.mybatis.boardProject.post.service;

import com.mybatis.boardProject.post.dto.PostRequest;
import com.mybatis.boardProject.post.dao.PostMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    private final PostMapper postMapper;

    public PostServiceImpl(PostMapper postMapper) {
        this.postMapper = postMapper;
    }
    @Transactional
    public Long insertPost(PostRequest params) {
        postMapper.insertPost(params);
        return params.getPostId();
    }

    public PostRequest selectPost(Long id) {
        return postMapper.selectPost(id);
    }

    @Transactional
    public void updatePost(PostRequest params) {
        postMapper.updatePost(params);
    }

    @Transactional
    public void deletePost(Long id) {
        postMapper.deletePost(id);
    }

    public List<PostRequest> selectPostList() {
        return postMapper.selectPostList();
    }

    public int count() {
        return postMapper.count();
    }
}
