package com.example.springboothello.entity;

import lombok.Data;

import java.io.Serializable;

// 参数表
@Data
public class SpecParam implements Serializable {
    private Integer id;
    private Integer spgId;
    private String name; // 参数名称
    private String unit; //单位（词量）
}
