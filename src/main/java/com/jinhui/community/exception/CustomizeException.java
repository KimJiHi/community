package com.jinhui.community.exception;

/**
 * @Author: JinHui
 * @Date: 2020-04-01 01:43
 * @version: 1.0
 */
public class CustomizeException extends RuntimeException {
    private String message;

    public CustomizeException(ICustomizeErrorCode errorCode) {
        this.message = errorCode.getMessage();
    }

    public CustomizeException(String message) {
        this.message = message;
    }
    @Override
    public String getMessage(){
        return message;
    }
}
