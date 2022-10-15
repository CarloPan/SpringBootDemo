package com.example.springboothello.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private String phoneNum;
    private String email;
    private Role role;
}