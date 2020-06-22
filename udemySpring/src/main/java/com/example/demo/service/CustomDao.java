package com.example.demo.service;

import com.example.demo.user.User;

import java.util.List;

public interface CustomDao {
    public List<User> getByName(String name);
    public List<User> sortByZip();
}
