package com.mybatis.boardProject.post.controller;

import com.mybatis.boardProject.post.dto.PostRequest;
import com.mybatis.boardProject.post.service.PostService;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {
    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/board/{board-id}/post")
    public void insertPost(@PathVariable("board-id") String boardId, @RequestParam PostRequest params){
        postService.insertPost(params);
    }
}
