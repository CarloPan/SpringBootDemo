package com.example.springboothello.test;

import java.text.MessageFormat;

public class StringFormatTest {
    public static void main(String[] args) {

        Integer hour = 12;
        Integer minute = 0;
        Integer second = 33;
        String result = String.format("%02d:%02d:%02d",hour,minute,second);
        System.out.println(result);

        //String.format("{0}{1}{2}","{",1,"}");//{1}
        String format = String.format("{0}{1}{2}", 11, 1, 22);//{1}
        System.out.println(format);
        System.out.println("------------------");
        String a= "aaa";
        String b= "bb";
        String c= "c";
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(b).append(c);
        System.out.println(MessageFormat.format(" {0} {1} {2} {3}", a, b,"",sb));
        System.out.println(MessageFormat.format(" ''{0}'' '{1}' {2} {3}", a, b,"",sb.toString()));

    }
}
