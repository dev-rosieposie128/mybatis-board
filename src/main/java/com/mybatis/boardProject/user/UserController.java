package com.mybatis.boardProject.user;

import com.mybatis.boardProject.common.exception.CustomException;
import com.mybatis.boardProject.common.dto.CommonResponse;
import com.mybatis.boardProject.common.code.StatusCode;
import com.mybatis.boardProject.user.dto.UserCreateRequest;
import com.mybatis.boardProject.user.dto.UserResponseDto;
import com.mybatis.boardProject.user.dto.UserUpdateRequest;
import com.mybatis.boardProject.user.model.User;
import com.mybatis.boardProject.user.service.UserService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.Optional;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 회원 등록
     *
     * @param userCreateRequest - 회원 정보
     *                          1. userCreateRequest 유효성 검사
     *                          2. 통과시 회원 등록
     */
    @PostMapping("/user")
    public CommonResponse<?> insertUser(@Valid @RequestBody UserCreateRequest userCreateRequest) {

        userService.insertUser(userCreateRequest);

        return CommonResponse.builder()
                             .code(StatusCode.USER_SUCCESS.getStatus().value())
                             .msg(StatusCode.USER_SUCCESS.getMessage())
                             .body(userCreateRequest)
                             .build();
    }

    /**
     * 로그인 아이디 중복 체크
     * @param loginId - 로그인 아이디
     */
    @GetMapping("/user/login/{loginId}")
    public CommonResponse<?> duplicateCheckLoginId(@PathVariable("loginId") String loginId) {
        if(userService.duplicateCheckLoginId(loginId)){
            throw new CustomException(StatusCode.DUPLICATE_LOGIN_ID);
        } return CommonResponse.builder()
                                .code(StatusCode.LOGIN_ID_SUCCESS.getStatus().value())
                                .msg(StatusCode.LOGIN_ID_SUCCESS.getMessage())
                                .body(loginId)
                                .build();
    }

    /**
     * 회원 리스트 조회
     * @param
     */
    @GetMapping("/users")
    public CommonResponse<?> selectUserList(){

        userService.selectUserList();

        return CommonResponse.builder()
                            .code(StatusCode.SUCCESS.getStatus().value())
                            .msg(StatusCode.SUCCESS.getMessage())
                            .body(userService.selectUserList())
                            .build();
    }

    /**
     * 회원 상세 조회
     * @param userId - 회원 아이디
     */
    @GetMapping("/user/{userId}")
    public CommonResponse<?> selectUser(@PathVariable("userId") Long userId) {

        Optional<UserResponseDto> result = Optional.ofNullable(userService.selectUser(userId));

        if (result.isPresent()) {
            return CommonResponse.builder()
                                 .code(StatusCode.SUCCESS.getStatus().value())
                                 .msg(StatusCode.SUCCESS.getMessage())
                                 .body(userService.selectUser(userId))
                                 .build();
        } else {
            return CommonResponse.builder()
                                 .code(StatusCode.USER_NOT_FOUND.getStatus().value())
                                 .msg(StatusCode.USER_NOT_FOUND.getMessage())
                                 .body(userService.selectUser(userId))
                                 .build();
        }
    }

    /**
     * 회원 수정
     * @param userUpdateRequest - 회원 정보
     */
    @PatchMapping("/user/{userId}")
    public CommonResponse<?> updateUser(@PathVariable("userId") Long userId, @Validated @RequestBody UserUpdateRequest userUpdateRequest) {

        User user = User.builder()
                        .userId(userId)
                        .name(userUpdateRequest.getName())
                        .pwd(userUpdateRequest.getPwd())
                        .email(userUpdateRequest.getEmail())
                        .build();

        userService.updateUser(user);

        return CommonResponse.builder()
                .code(StatusCode.SUCCESS.getStatus().value())
                .msg(StatusCode.SUCCESS.getMessage())
                .body(userUpdateRequest)
                .build();
    }

    /**
     * 회원 탈퇴
     * @param userId - 회원 아이디
     */
    @DeleteMapping("/user/{userId}")
    public CommonResponse<?> deleteUser(@PathVariable("userId") Long userId) {

        userService.deleteUser(userId);

        return CommonResponse.builder()
                .code(StatusCode.NO_CONTENT.getStatus().value())
                .msg(StatusCode.NO_CONTENT.getMessage())
                .body(userId)
                .build();
    }
}
