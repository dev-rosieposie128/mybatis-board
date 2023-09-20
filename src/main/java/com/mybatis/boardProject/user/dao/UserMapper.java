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

    /**
     * 회원 등록
     * @param userCreateRequest - 회원 정보
     */
    public void insertUser(UserCreateRequest userCreateRequest);

    public void updateUser(User user);

    /**
     * 로그인 중복 조회
     * @param loginId - 로그인 아이디
     */
    public boolean duplicateCheckLoginId(String loginId);

    /**
     * 이메일 중복 조회
     * @param email - 이메일
     */
    public boolean duplicateCheckEmail(String email);

    public UserResponseDto selectUser(Long userId);

    public List<UserResponseDto> selectUserList();
}
