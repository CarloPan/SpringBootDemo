package com.example.springboothello.controller;

import com.example.springboothello.service.Test0001;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AsceptController {

    @Autowired
    Test0001 test0001;

    @RequestMapping("/ascept")
    @ResponseBody
    public String ascept(){
        try{
            test0001.test01Method00(100);
        }catch (Throwable throwable) {
            System.out.println("ascept------------");
        }
        return "hello,SpringBoot!";
    }

}
