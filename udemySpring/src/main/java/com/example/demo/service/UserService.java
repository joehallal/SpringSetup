package com.example.demo.service;

import com.example.demo.user.User;
import com.example.demo.user.PrivateInfo;
import com.example.demo.user.UserNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao){
        this.userDao = userDao;
    }

    public List<User> retrieveAllUsers() {
        return userDao.findAll();
    }

    public Optional<User> getById(@PathVariable int id) {
        return userDao.findById(id);
    }

    @GetMapping("/users/name/{name}")
    public List<User> getUserByName(@PathVariable String name) {
        List<User> result = userDao.getByName(name);
        if (result.size() == 0) {
            throw new UserNotFoundException("Name: " + name);
        }
        return result;
    }

    @PostMapping("/users")
    public User createUser(@RequestBody PrivateInfo info) {
        User newUser = new User(info.getId(),
                info.getName(),
                Integer.toString(info.getZipcode()));
        return userDao.save(newUser);
    }

    @PostMapping("/userBasic")
    public User createUserBasic(@RequestBody User user) {
        return userDao.save(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id) {
        userDao.deleteById(id);
        // alternatives that arent void? could implement myself
    }

    public User updateUser(@RequestBody User user) {
        return userDao.save(user);
    }

    public List<User> orderByZip(){
        return userDao.sortByZip();
    }
}
