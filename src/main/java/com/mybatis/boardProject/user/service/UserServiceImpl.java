package com.mybatis.boardProject.user.service;

import com.mybatis.boardProject.common.code.StatusCode;
import com.mybatis.boardProject.common.exception.CustomException;
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

        if(duplicateCheckLoginId(userCreateRequest.getLoginId())){
            throw new CustomException(StatusCode.DUPLICATE_LOGIN_ID);
        }
        if(duplicateCheckEmail(userCreateRequest.getEmail())){
            throw new CustomException(StatusCode.DUPLICATE_EMAIL);
        }

        userMapper.insertUser(userCreateRequest);

    }

    public boolean duplicateCheckLoginId(String loginId) {
        return userMapper.duplicateCheckLoginId(loginId);
    }

    public boolean duplicateCheckEmail(String email) {
        return userMapper.duplicateCheckEmail(email);
    }

    public List<UserResponseDto> selectUserList() {
        return userMapper.selectUserList();
    }

    public UserResponseDto selectUser(Long userId) {
        return userMapper.selectUser(userId);
    }

    @Transactional
    public void deleteUser(Long userId) {

        try{
            userMapper.deleteUser(userId);
        }catch (Exception e){
            throw new CustomException(StatusCode.DELETE_ERROR);
        }
    }

    @Transactional
    public void updateUser(User user) {
        try{
            userMapper.updateUser(user);
        }catch (Exception e){
            throw new CustomException(StatusCode.UPDATE_ERROR);
        }
    }
}
