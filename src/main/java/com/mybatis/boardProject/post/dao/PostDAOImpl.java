package com.mybatis.boardProject.post.dao;

import com.mybatis.boardProject.post.PostDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostDAOImpl implements PostDAO {
    private final SqlSession sqlSession;

    public PostDAOImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }
    public void insertPost(PostDTO params) {
        sqlSession.insert("postMapper.insertPost",params);
    }
    public PostDTO selectPost(Long id) {
        return sqlSession.selectOne("postMapper.selectPost",id);
    }
    public void updatePost(PostDTO params) {
        sqlSession.update("postMapper.updatePost",params);
    }
    public void deletePost(Long id) {
        //sqlSession.update("postMapper.updatePost",id);
        sqlSession.delete("postMapper.deletePost",id);
    }
    public List<PostDTO> selectPostList() {
        return sqlSession.selectList("postMapper.selectPostList");
    }
    public int count() {
        return sqlSession.selectOne("postMapper.count");
    }
}
