package com.example.springboothello.user2;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Role2 {
    private Long id;
    private String roleName;
    private String description;
}