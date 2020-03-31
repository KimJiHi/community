package com.jinhui.community.exception;

/**
 * @Author: JinHui
 * @Date: 2020-04-01 02:04
 * @version: 1.0
 */
public enum  CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND("你找的问题不存在,要不要换个试试?");

    private String message;

    CustomizeErrorCode(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
