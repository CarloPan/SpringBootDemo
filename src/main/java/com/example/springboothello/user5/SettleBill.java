package com.example.springboothello.user5;

import lombok.Data;

import java.util.List;

@Data
public class SettleBill {
    private Integer id;
    private String name;
    private String desc;

    private CustomerVO customerVO;

    private List<String> headerIdList;
}
