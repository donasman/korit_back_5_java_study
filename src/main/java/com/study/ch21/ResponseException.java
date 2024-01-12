package com.study.ch21;

import lombok.Data;

import java.util.Map;
import java.util.Objects;

@Data

public class ResponseException extends RuntimeException {  // Exception 예외를 만드는 클래스

    private Map<String, Object> errorMap;

    public ResponseException(String message, Map<String, Object> errorMap) {
        super(message);
        this.errorMap = errorMap;
    }

}
