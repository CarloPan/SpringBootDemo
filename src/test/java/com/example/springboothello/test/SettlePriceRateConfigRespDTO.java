package com.example.springboothello.test;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SettlePriceRateConfigRespDTO {
    /**租户编码*/
    private String tenantCode;

    /**商户编码*/
    private String merchantCode;

    /**商户名称*/
    private String merchantName;

    /**点位列表名称*/
    private String rateListName;

    /**价格计算模式：1 固定价格、2 点位价格、3 订单价格、4 价格列表*/
    private String priceType;

    /**2C业务，店铺平台类型*/
    private String shopPlaformType;

    /**2C业务，店铺平台名称*/
    private String shopPlaformName;

    /**2C业务，店铺编码*/
    private String shopCode;

    /**2C业务，店铺名称*/
    private String shopName;

    /**2C业务，分销店铺编码*/
    private String distributeShopCode;

    /**2C业务，分销店铺名称*/
    private String distributeShopName;

    /**生效时间*/
    private LocalDateTime beginTime;

    /**失效时间*/
    private LocalDateTime endTime;

    /**备注*/
    private String remark;

    /**是否删除：0-否，1-是*/
    private Integer deleteFlag;

    /**创建时间*/
    private LocalDateTime createTime;

    /**创建人*/
    private String createdBy;

    /**最后修改时间*/
    private LocalDateTime updateTime;

    /**最后修改人*/
    private String updatedBy;

    /**版本号*/
    private Integer version;
}
