package com.example.springboothello.user5;

import lombok.Data;

import java.util.List;

@Data
public class SettleBillReqDto {
    private Integer id;
    private String name;
    private String desc;

    private String tenantCode;
    private String tenantName;

    private List<String> headerIdList;
}
