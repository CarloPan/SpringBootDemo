package com.example.springboothello.product;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class Product {

    private Long id;
    private Integer num;
    private BigDecimal price;
    private String name;
    private String category;

    private LocalDate date1;

    public Product(Long id, Integer num, BigDecimal price, String name, String category) {
        this.id = id;
        this.num = num;
        this.price = price;
        this.name = name;
        this.category = category;
    }
}
