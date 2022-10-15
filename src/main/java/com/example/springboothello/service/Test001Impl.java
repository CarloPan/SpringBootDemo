package com.example.springboothello.service;

import org.springframework.stereotype.Service;

@Service
public class Test001Impl implements Test0001{

    public void test01Method00(int a){

        System.out.println("test01Method00...........");
        int i = 1/0;
    }
}
