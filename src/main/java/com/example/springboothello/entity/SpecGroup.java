package com.example.springboothello.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class SpecGroup implements Serializable {
    private Integer id;
    private Integer spgId;
    private String name;

    List<SpecParam> specParamList;
}
