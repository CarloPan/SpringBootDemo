package com.example.springboothello.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller//RestController返回实体对象，Controller返回页面
public class HelloController {

    /*@Value("${alipay.pay.env}")
    private String env;*/

    /*@Value("${spring.profiles.active}")
    private String active;*/

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello,SpringBoot!";
    }

    @RequestMapping("/env")
    @ResponseBody
    public String envMessage(){
        return "hello,SpringBoot! active="+ "active";
    }
}
