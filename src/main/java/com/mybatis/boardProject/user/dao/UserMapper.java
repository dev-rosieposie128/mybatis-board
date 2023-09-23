package com.mybatis.boardProject.user.dao;

import com.mybatis.boardProject.user.dto.UserCreateRequest;
import com.mybatis.boardProject.user.dto.UserResponseDto;
import com.mybatis.boardProject.user.dto.UserUpdateRequest;
import com.mybatis.boardProject.user.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    public void insertUser(UserCreateRequest userCreateRequest);

    public void updateUser(User user);

    public boolean duplicateCheckLoginId(String loginId);

    public boolean duplicateCheckEmail(String email);

    public UserResponseDto selectUser(Long userId);

    public List<UserResponseDto> selectUserList();
    public void deleteUser(Long userId);
}
