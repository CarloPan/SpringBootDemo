package com.example.springboothello.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest2 {

    public static void main(String[] args) throws InterruptedException, ParseException {
        DateItem2  dateItem2 = new  DateItem2();
        Date beginDate = new Date();

        /*String beginTime = "2018-07-28 14:42:32";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");*/
        String beginTime = "14:42:32";
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date date1 = format.parse(beginTime);

        dateItem2.setDateRate(date1);

        Thread.sleep(1000L);
        Date endDate = new Date();
        boolean result = dateItem2.getDateRate().before(endDate);
        System.out.println(result);
    }
}
