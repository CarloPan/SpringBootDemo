package com.example.springboothello.user2;

import com.example.springboothello.user.Role;
import com.example.springboothello.user.User;
import com.example.springboothello.user.UserRoleDto;
import com.example.springboothello.user.UserRoleMapper;
import org.junit.Before;
import org.junit.Test;

public class MainTest2 {
    User2 user = null;

    /**
     * 模拟从数据库中查出user对象
     */
    @Before
    public void before() {
        Role2 role    = new Role2(2L, "administrator", "超级管理员");
        user  = new User2(1L, "zhangsan", "12345", "17677778888", "123@qq.com", "222","",role);
    }

    /**
     * 模拟把user对象转换成UserRoleDto对象
     */
    @Test
    public void test1() {

        UserRoleDto2 userRoleDto = UserRoleMapper2.INSTANCES.toUserRoleDto2(user);
        System.out.println(userRoleDto);
        //UserRoleDto(userId=1, name=zhangsan, roleName=administrator)
    }

    @Test
    public void test2() {
        UserRoleDto2 userRoleDto = UserRoleMapper2.INSTANCES.defaultConvert();
        System.out.println(userRoleDto);
    }

}
