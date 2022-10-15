package com.example.springboothello.java8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class java8Test {

    @Test
    public void test01(){
        //Consumer
        Consumer<Integer> consumer = (x) -> {
            x = x + 30;
            System.out.println("消费型接口" + x);
        };
        //test
        consumer.accept(100);
    }

    @Test
    public void test02(){
        List<Integer> list = new ArrayList<>();
        List<Integer> integers = Arrays.asList(1,2,3);
        list.addAll(integers);
        //Supplier<T>
        Supplier<Integer> supplier = () -> (int)(Math.random() * 10);
        list.add(supplier.get());
        System.out.println(supplier);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    @Test
    public void test04(){
        //Predicate<T>
        Integer age = 35;
        Predicate<Integer> predicate = (i) -> i >= 35;
        if (predicate.test(age)){
            System.out.println("你该退休了");
        } else {
            System.out.println("我觉得还OK啦");
        }
    }
}
