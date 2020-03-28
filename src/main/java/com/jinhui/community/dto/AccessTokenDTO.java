package com.jinhui.community.dto;

import lombok.Data;

/**
 * @Author: JinHui
 * @Date: 2020-03-27 02:21
 * @version: 1.0
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
