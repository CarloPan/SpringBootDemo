package com.example.springboothello.po;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class CoolBoy {
    private String name;
    private Integer age;
    private BigDecimal salary;

    private String girlFriends;
}
