package com.mybatis.boardProject.user.service;

import com.mybatis.boardProject.user.dao.UserMapper;
import com.mybatis.boardProject.user.dto.UserCreateRequest;
import com.mybatis.boardProject.user.dto.UserResponseDto;
import com.mybatis.boardProject.user.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Transactional
    public void insertUser(final UserCreateRequest userCreateRequest) {
        userMapper.insertUser(userCreateRequest);
    }

    public boolean duplicateCheckLoginId(String loginId) {
        return userMapper.duplicateCheckLoginId(loginId);
    }

    @Override
    public UserResponseDto selectUser(Long userId) {
        return userMapper.selectUser(userId);
    }

    @Transactional
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public List<UserResponseDto> selectUserList() {
        return userMapper.selectUserList();
    }

}
