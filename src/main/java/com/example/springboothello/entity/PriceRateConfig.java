package com.example.springboothello.entity;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class PriceRateConfig implements Serializable {
    private String tenantCode;//租户
    private String centerCode;//营销中心
    private String customerCode;//客户编码
    private String merchantCode;
    private String shopCode;
    private String rateName;
    private BigDecimal retePrice;
    private Boolean flag;
}
