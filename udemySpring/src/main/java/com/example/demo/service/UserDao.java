package com.example.demo.service;

import com.example.demo.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer>, CustomDao {

}
