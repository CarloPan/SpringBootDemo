package com.example.springboothello.user6;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MapStructControllerTest {

    //demo1 简单对象转换
    @Test
    public void test1(){
        CarEntity carEntity = new CarEntity();
        carEntity.setName("大众");
        carEntity.setMode("辉腾");
        carEntity.setMileage(20000D);
        //CarDto carToDto = IMapStructService.INTANCE.carToDto(carEntity);
    }
    //单个复杂对象转换
    @Test
    public void test2(){
        //生成一个复杂对象 prosonEntity
        CarEntity carEntity = new CarEntity();
        carEntity.setName("大众");
        carEntity.setMode("辉腾");
        carEntity.setMileage(20000D);

        List<CarEntity> carList = new ArrayList<>();
        carList.add(carEntity);

        JobEntity jobEntity = new JobEntity();
        jobEntity.setName("java开发工程师");
        jobEntity.setAddress("天府广场");
        jobEntity.setCompanyName("XXXX科技公司");

        PersonEntity personEntity = new PersonEntity();
        personEntity.setName("张三");
        personEntity.setAge(28);
        personEntity.setBrithDay(new Date());
        personEntity.setEmail("lt@aliyun.com");
        personEntity.setJob(jobEntity);
        personEntity.setCarList(carList);

        PersonDto personDto = IMapStructService.INTANCE.personToDto(personEntity);
        System.out.println(personDto.toString());
        System.out.println(personEntity.toString());
    }

}
