package com.example.demo.stubs;

import com.example.demo.service.CustomDao;
import com.example.demo.service.CustomDaoImpl;
import org.junit.Test;

public class CustomDaoImplStub {

    public CustomDaoImplStub() {

    }

    @Test
    public void test() {
        CustomDao customDaoStub = new CustomDaoStub();
        CustomDaoImpl customDaoImpl = new CustomDaoImpl();

    }

}
