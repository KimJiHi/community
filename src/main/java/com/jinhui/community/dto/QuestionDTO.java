package com.jinhui.community.dto;

import com.jinhui.community.Model.User;
import lombok.Data;

/**
 * @Author: JinHui
 * @Date: 2020-03-28 22:04
 * @version: 1.0
 */
@Data
public class QuestionDTO {
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
    private User user;
}
