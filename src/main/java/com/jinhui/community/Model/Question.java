package com.jinhui.community.Model;

import lombok.Data;

/**
 * @Author: JinHui
 * @Date: 2020-03-28 15:06
 * @version: 1.0
 */
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;
    private String tag;
}
