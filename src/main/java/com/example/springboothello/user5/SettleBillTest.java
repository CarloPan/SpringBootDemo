package com.example.springboothello.user5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SettleBillTest {

    @Test
    public void test1(){
        SettleBillReqDto settleBillReqDto = new SettleBillReqDto();
        List<String> headerIdList = new ArrayList<>();
        headerIdList.add("0001");
        headerIdList.add("0002");

        settleBillReqDto.setId(99);
        settleBillReqDto.setName("名称");
        settleBillReqDto.setDesc("描述");
        settleBillReqDto.setTenantCode("T00001");
        settleBillReqDto.setHeaderIdList(headerIdList);

        SettleBillMapper instance = SettleBillMapper.INSTANCE;
        SettleBill settleBill = instance.converToSettleBill(settleBillReqDto);
        System.out.println(settleBill);
    }
    @Test
    public void test2(){
        SettleBill settleBill = new SettleBill();
        settleBill.setId(99);
        settleBill.setName("名称bill");
        settleBill.setDesc("描述bill");

        CustomerVO customerVO = new CustomerVO();
        customerVO.setTenantCode("T003");
        customerVO.setTenantName("生活电器事业部");
        settleBill.setCustomerVO(customerVO);
        SettleBillMapper instance = SettleBillMapper.INSTANCE;
        SettleBillReqDto settleBillReqDto =instance.converToSettleBillDto(settleBill);
        System.out.println(settleBillReqDto);
    }

}
