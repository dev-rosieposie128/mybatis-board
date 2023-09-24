package com.mybatis.boardProject.common.code;
import org.springframework.http.HttpStatus;
public enum StatusCode {

    // 200, 201 성공
    SUCCESS(HttpStatus.OK, "요청 성공하였습니다."),
    LOGIN_ID_SUCCESS(HttpStatus.OK, "사용가능한 아이디입니다."),
    USER_SUCCESS(HttpStatus.CREATED, "회원가입에 성공하였습니다."),
    NO_CONTENT(HttpStatus.NO_CONTENT, "요청 성공하였습니다."),

    // 400
    INVALID_PARAMETER(HttpStatus.BAD_REQUEST, "허용되지 않는 값입니다. 다시 입력해주세요"),

    // 401,403 인증, 권한
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED,  "인증이 필요합니다."),
    ROLE_NOT_EXISTS(HttpStatus.FORBIDDEN, "접근이 거부되었습니다. 관리자에게 문의해 주세요"),

    // 404 리소스 없음
    USER_NOT_FOUND(HttpStatus.BAD_REQUEST, "존재하지 않는 회원입니다."),
    RESOURCE_NOT_FOUND(HttpStatus.NOT_FOUND, "요청한 페이지를 찾을 수 없습니다. 관리자에게 문의해 주세요"),
    TOKEN_NOT_EXISTS(HttpStatus.NOT_FOUND, "해당 key의 인증 토큰이 존재하지 않습니다."),

    // 405 지원하지 않는 HTTP Method
    METHOD_NOT_ALLOWED(HttpStatus.METHOD_NOT_ALLOWED, "허용되지 않은 요청입니다."),

    // 409 중복
    DUPLICATE_LOGIN_ID(HttpStatus.CONFLICT, "이미 사용중인 아이디입니다."),
    DUPLICATE_EMAIL(HttpStatus.CONFLICT, "이미 사용중인 이메일입니다."),

    // 500 서버에러
    INSERT_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "등록에 실패하였습니다. 다시 시도해주세요."),
    UPDATE_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "수정에 실패하였습니다. 다시 시도해주세요."),
    DELETE_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "삭제에 실패하였습니다. 다시 시도해주세요."),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "서버 내부 오류입니다. 다시 시도해주세요.");
    private final HttpStatus status;
    private final String message;

    StatusCode(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }
    public HttpStatus getStatus() {
        return status;
    }
    public String getMessage() {
        return message;
    }
}
