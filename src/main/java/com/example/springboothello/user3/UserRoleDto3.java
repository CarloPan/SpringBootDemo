package com.example.springboothello.user3;

import lombok.Data;

@Data
public class UserRoleDto3 {
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 用户名
     */
    private String name;
    /**
     * 角色名
     */
    private String roleName;
}

