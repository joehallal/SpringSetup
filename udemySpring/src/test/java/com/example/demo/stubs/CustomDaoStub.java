package com.example.demo.stubs;

import com.example.demo.service.CustomDao;
import com.example.demo.user.User;

import java.util.Arrays;
import java.util.List;


public class CustomDaoStub implements CustomDao {

    @Override
    public List<User> getByName(String name) {
        User u1 = new User();
        User u2 = new User();

        return Arrays.asList(u1, u2);
    }

    @Override
    public List<User> sortByZip() {
        return null;
    }
}
