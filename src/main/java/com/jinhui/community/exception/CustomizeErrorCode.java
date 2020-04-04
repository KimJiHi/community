package com.jinhui.community.exception;

/**
 * @Author: JinHui
 * @Date: 2020-04-01 02:04
 * @version: 1.0
 */
public enum  CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND(2001,"你找的问题不存在,要不要换个试试?"),
    TARGET_PARAM_NOT_FOUND(2002,"未选中任何问题或评论进行回复!"),
    NO_LOGIN(2003,"未登录不能进行评论，请先登录!"),
    SYS_ERROR(2004,"服务器冒烟了，要不你等会再试试"),
    TYPE_PARAM_WRONG(2005,"评论类型错误或不存在!"),
    COMMENT_NOT_FOUND(2006,"你回复的评论不存在了,要不要换个试试?"),;


    private Integer code;
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }

}
