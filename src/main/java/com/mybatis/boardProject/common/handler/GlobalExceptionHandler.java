package com.mybatis.boardProject.common.handler;

import com.mybatis.boardProject.common.dto.CommonResponse;
import com.mybatis.boardProject.common.dto.ErrorResponse;
import com.mybatis.boardProject.common.exception.CustomException;
import org.cef.handler.CefLoadHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;

@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 커스텀 응답으로, 비지니스 로직에서 에러 발생시 사용된다.
     * 바디에는 ErrorResponse를 한번 더 감싸서 리턴한다.
     */
    @ExceptionHandler(value = CustomException.class)
    public ResponseEntity<ErrorResponse> customHandler(CustomException e){

         ErrorResponse errorResponse = ErrorResponse.builder()
                        .status(e.getErrorCode().getStatus().value())
                        .error(e.getErrorCode().getStatus().name())
                        .code(e.getErrorCode().name())
                        .message(e.getErrorCode().getMessage())
                        .build();

        return ResponseEntity.status(e.getErrorCode().getStatus().value())
                .body(errorResponse);
    }

    /**
     * javax.validation.Valid or @Validated 으로 binding error 발생시 발생한다.
     * HttpMessageConverter 에서 등록한 HttpMessageConverter binding 못할경우 발생
     * 주로 @RequestBody, @RequestPart 어노테이션에서 발생
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String processValidationError(MethodArgumentNotValidException exception) {
        BindingResult bindingResult = exception.getBindingResult();

        StringBuilder builder = new StringBuilder();

        for (FieldError fieldError : bindingResult.getFieldErrors()) {
            builder.append("[");
            builder.append(fieldError.getField());
            builder.append("](은)는 ");
            builder.append(fieldError.getDefaultMessage());
            builder.append(" 입력된 값: [");
            builder.append(fieldError.getRejectedValue());
            builder.append("]");
        }

        return builder.toString();
    }
}
