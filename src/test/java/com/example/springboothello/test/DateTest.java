package com.example.springboothello.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

    public static void main(String[] args) {
        beginMillisecond();
        //dateBeforeAfter();
    }

    //获取毫秒数比较
    public static boolean beginMillisecond(){
        String beginTime = "2018-07-28 14:42";
        String endTime = "2018-07-29 12:26:32";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date1 = format.parse(beginTime);
            Date date2 = format.parse(endTime);
            long beginMillisecond = date1.getTime();
            long endMillisecond = date2.getTime();
            System.out.println(beginMillisecond > endMillisecond); //false
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static boolean datecompareTo(){
        String beginTime = "2018-07-28 14:42:32";
        String endTime = "2018-07-29 12:26:32";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date1 = format.parse(beginTime);
            Date date2 = format.parse(endTime);
            int compareTo = date1.compareTo(date2);
            System.out.println(compareTo);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return true;
    }
    public static  boolean dateBeforeAfter(){
        String beginTime = "2018-07-28 14:42:32";
        String endTime = "2018-07-29 12:26:32";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date1 = format.parse(beginTime);
            Date date2 = format.parse(endTime);
            boolean before = date1.before(date2);
            System.out.println(before);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return  true;
    }
}
