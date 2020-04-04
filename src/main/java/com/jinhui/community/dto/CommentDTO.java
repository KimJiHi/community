package com.jinhui.community.dto;

import lombok.Data;

/**
 * @Author: JinHui
 * @Date: 2020-04-02 04:55
 * @version: 1.0
 */
@Data
public class CommentDTO {
    private Long parentId;
    private Integer type;
    private String content;
}
