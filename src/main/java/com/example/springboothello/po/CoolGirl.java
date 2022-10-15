package com.example.springboothello.po;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class CoolGirl {
    private String name;
    private Integer age;
    private Integer girlType;

    private BigDecimal beauty;

    private String boyFriends;
}
