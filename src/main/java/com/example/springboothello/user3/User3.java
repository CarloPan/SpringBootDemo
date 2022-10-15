package com.example.springboothello.user3;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class User3 {
    private Long id;
    private String username;
    private String password;
    private String phoneNum;
    private String email;
    private Role3 role;
}

