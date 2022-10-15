package com.example.springboothello.test;

import lombok.Data;

import java.util.Date;
import java.util.Objects;

public class DateTest3 {

    public static void main(String[] args) {
        DateDemo dateDemo = new DateDemo();
        Date dd = dateDemo.getDate1();
        if(Objects.isNull(dd)){
            System.out.println("dd="+dd);
        }
        dateDemo.setDate2(new Date());
        Date dd2 = dateDemo.getDate2();
        if(Objects.isNull(dd2)){
            System.out.println("dd2="+dd2);
        }
        System.out.println(dateDemo);
        UoVo uoVo = dateDemo.getUoVo();
        System.out.println("uoVo = "+uoVo);
        if(Objects.isNull(dateDemo.getUoVo())){
        }
        uoVo.setDate3(new Date());
        if(Objects.isNull(dateDemo.getUoVo().getDate3())){
            System.out.println("11111111111");
        }

    }

    @Data
    public static class DateDemo{
        Date date1;
        Date date2;
        UoVo uoVo;

    }

    @Data
    public static class UoVo{
        String name;
        Date date4;
        Date date3;
    }
}
