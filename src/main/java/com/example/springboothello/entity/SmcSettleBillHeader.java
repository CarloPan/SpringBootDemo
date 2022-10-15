package com.example.springboothello.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class SmcSettleBillHeader implements Serializable {

    private static final long serialVersionUID = 6941946831855432687L;

    private String name;
    private double aDouble;
    private float aFloat;
    private Integer intValue;

    private Long aLong;
    private long al;
    private BigDecimal bd;

    private  BigDecimal bdPoint;
}
