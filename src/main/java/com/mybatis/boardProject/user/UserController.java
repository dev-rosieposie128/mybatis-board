package com.mybatis.boardProject.user;

import com.mybatis.boardProject.common.dto.RespDto;
import com.mybatis.boardProject.common.validator.UserCreateValidator;
import com.mybatis.boardProject.user.dto.UserCreateRequest;
import com.mybatis.boardProject.user.dto.UserResponseDto;
import com.mybatis.boardProject.user.dto.UserUpdateRequest;
import com.mybatis.boardProject.user.model.User;
import com.mybatis.boardProject.user.service.UserService;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UserController {
    private UserService userService;
    private UserCreateValidator userCreateValidator;
    public UserController(UserService userService, UserCreateValidator userCreateValidator) {
        this.userService = userService;
        this.userCreateValidator = userCreateValidator;
    }

    /**
     * 회원 등록
     * @param userCreateRequest - 회원 정보
     * 1. userCreateRequest 유효성 검사
     * 2. 아이디, 이메일 중복 검사
     * 3. 통과시 회원 등록
     */
    @PostMapping("/user")
    public RespDto<?> insertUser(@Valid @RequestBody UserCreateRequest userCreateRequest, Errors errors) {

        if (errors.hasErrors()) {
            return new RespDto<>(-1, "회원가입실패", errors.getAllErrors());
        }

        userCreateValidator.validate(userCreateRequest,errors);
        if(errors.hasErrors()) {
            return new RespDto<>(-1, "회원가입실패", errors.getAllErrors());
        }

        userService.insertUser(userCreateRequest);
        return new RespDto<>(1, "회원가입완료", userCreateRequest.getLoginId());
    }

    /**
     * 로그인 아이디 중복 체크
     * @param loginId - 로그인 아이디
     */
    @GetMapping("/user/login/{loginId}")
    public RespDto<?> duplicateCheckLoginId(@PathVariable("loginId") String loginId) {
        if(userService.duplicateCheckLoginId(loginId)){
            return new RespDto<>(-1, "이미 사용 중인 ID입니다.", loginId);
        } return new RespDto<>(1, "사용 가능한 ID입니다.", loginId);
    }

    /**
     * 회원 리스트 조회
     * @param
     */
    @GetMapping("/users")
    public RespDto<?> selectUserList(){
        return new RespDto<>(1, "조회 성공", userService.selectUserList());
    }


    /**
     * 회원 상세 조회
     * @param userId - 회원 아이디
     */
    @GetMapping("/user/{userId}")
    public RespDto<?> selectUser(@PathVariable("userId") Long userId) {

        return new RespDto<>(1, "조회 성공",  userService.selectUser(userId));
    }

    /**
     * 회원 수정
     * @param userUpdateRequest - 회원 정보
     */
    @PatchMapping("/user/{userId}")
    public RespDto<?> update(@PathVariable("userId") Long userId, @Validated @RequestBody UserUpdateRequest userUpdateRequest) {

        User user = new User();
        user.setUserId(userId);
        user.setName(userUpdateRequest.getName());
        user.setPwd(userUpdateRequest.getPwd());
        user.setEmail(userUpdateRequest.getEmail());
        userService.updateUser(user);

        return new RespDto<>(1, "회원수정완료", userUpdateRequest);
    }
}
