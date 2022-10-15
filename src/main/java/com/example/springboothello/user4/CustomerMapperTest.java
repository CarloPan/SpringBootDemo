package com.example.springboothello.user4;

import com.example.springboothello.user3.UserRoleMapper3;
import org.junit.Test;
import org.mapstruct.InheritInverseConfiguration;

public class CustomerMapperTest {

    @Test
    public void test1() {
        CustomerMapper instances = CustomerMapper.INSTANCE;
        CustomerDto CD = new CustomerDto();
        CD.setId(11L);
        CD.setCustomerName("客户名称001");
        Customer customer = instances.toCustomer(CD);
        System.out.println(customer);
    }

}
