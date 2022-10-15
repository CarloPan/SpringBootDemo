package com.example.springboothello.user3;

import com.example.springboothello.user4.CustomerMapper;
import org.junit.Before;
import org.junit.Test;

public class Test3{
    Role3 role = null;
    User3 user = null;

    @Before
    public void before() {
        role = new Role3(2L, "administrator", "超级管理员");
        user = new User3(1L, "zhangsan", "12345", "17677778888", "123@qq.com", role);
    }
    @Test
    public void test1() {
        CustomerMapper instances = CustomerMapper.INSTANCE;
        //UserRoleDto3 userRoleDto = instances.updateDto(user,"参数传递角色");
        //System.out.println(userRoleDto);
    }
}