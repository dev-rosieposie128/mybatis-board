package com.mybatis.boardProject.common.validator;

import com.mybatis.boardProject.common.dto.RespDto;
import com.mybatis.boardProject.user.dao.UserMapper;
import com.mybatis.boardProject.user.dto.UserCreateRequest;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
@Component
public class UserCreateValidator implements Validator {

    private UserMapper userMapper;

    public UserCreateValidator(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(UserCreateRequest.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserCreateRequest userCreateRequest = (UserCreateRequest)target;

        if(userMapper.duplicateCheckLoginId(userCreateRequest.getLoginId())){
            errors.rejectValue("loginId", "invalid.loginId",
                  new Object[]{userCreateRequest.getLoginId()}, "이미 사용중인 아이디 입니다.");
        }

        if(userMapper.duplicateCheckEmail(userCreateRequest.getEmail())){
            errors.rejectValue("email", "invalid.email",
                    new Object[]{userCreateRequest.getEmail()}, "이미 사용중인 이메일 입니다.");
        }
    }
}
