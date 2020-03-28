package com.jinhui.community.Model;

import lombok.Data;

/**
 * @Author: JinHui
 * @Date: 2020-03-27 20:27
 * @version: 1.0
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}
