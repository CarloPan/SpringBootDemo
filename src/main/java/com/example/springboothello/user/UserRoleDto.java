package com.example.springboothello.user;

import lombok.Data;

@Data
public class UserRoleDto {
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 用户名
     */
    private String name;

    private String email;
    /**
     * 角色名
     */
    private String roleName;
}

