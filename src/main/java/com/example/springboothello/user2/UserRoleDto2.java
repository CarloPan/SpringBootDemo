package com.example.springboothello.user2;

import lombok.Data;

@Data
public class UserRoleDto2 {
    /**
     * 用户id
     */
    private Long id;
    /**
     * 用户名
     */
    private String username;

    private String email;

    private String email2;
    private String email3;
    /**
     * 角色名
     */
    private String roleName;
}

