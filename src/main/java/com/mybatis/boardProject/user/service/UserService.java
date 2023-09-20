package com.mybatis.boardProject.user.service;

import com.mybatis.boardProject.user.dto.UserCreateRequest;
import com.mybatis.boardProject.user.dto.UserResponseDto;
import com.mybatis.boardProject.user.model.User;

import java.util.List;

public interface UserService {

    public void insertUser(UserCreateRequest userCreateRequest);
    public boolean duplicateCheckLoginId(String loginId);
    public void updateUser(User user);
    public List<UserResponseDto> selectUserList();
    public UserResponseDto selectUser(Long userId);
}
