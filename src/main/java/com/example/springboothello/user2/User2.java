package com.example.springboothello.user2;

import com.example.springboothello.user.Role;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class User2 {
    private Long id;
    private String username;
    private String password;
    private String phoneNum;
    private String email;
    private String email2;
    private String email3;
    private Role2 role;
}