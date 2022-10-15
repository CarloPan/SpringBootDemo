package com.example.springboothello.dto;

import com.example.springboothello.po.CoolGirl;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class CoolBoyDto {
    private String name;
    private Integer age;
    private BigDecimal salary;

    private List<CoolGirl> girlFriends;
}
