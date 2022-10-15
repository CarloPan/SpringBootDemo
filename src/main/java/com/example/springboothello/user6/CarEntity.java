package com.example.springboothello.user6;

import lombok.Data;

@Data
public class CarEntity {
    /**
     * 型号  速腾
     **/
    private String mode;
    /**
     * 品牌 大众
     **/
    private String name;
    /**
     * 里程
     **/
    private Double mileage;

    private String remark;
}
