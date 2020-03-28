package com.jinhui.community.dto;

import lombok.Data;

/**
 * @Author: JinHui
 * @Date: 2020-03-27 02:56
 * @version: 1.0
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatar_url;
}
