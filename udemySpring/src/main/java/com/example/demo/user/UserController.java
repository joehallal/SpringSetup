package com.example.demo.user;

import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    // Pawan's requests (and some fun extras)

    // Added (some) Exception Handling
    // Added Custom Service Handling for different User Objects
    // Extracted sensitive info (address, credit card number) from user table in service
    // Added DAOs for database interaction
    // Added Custom Query
    // Added CRUD operations
    // Used JPA
    // Used Constructor Injection

    // Http protocol headers
    // reference, redirect, exc
    // read about testing
    // J unit testing
    // mockito

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return userService.retrieveAllUsers();
    }

    @GetMapping("/users/id/{id}")
    public Optional<User> getById(@PathVariable int id) { return userService.getById(id); }

    @GetMapping("/users/name/{name}")
    public List<User> getUserByName(@PathVariable String name) { return userService.getUserByName(name); }

    @PostMapping("/users")
    public User createUserFromFullUser(@RequestBody PrivateInfo info) { return userService.createUser(info); }

    @PostMapping("/userBasic")
    public User createUserFromUser(@RequestBody User user) { return userService.createUserBasic(user); }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id) { userService.deleteUser(id); }

    @PutMapping("users")
    public User updateUser(@RequestBody User user) { return userService.updateUser(user); }

    @GetMapping("users/zipSort")
    public List<User> orderByZip(){ return userService.orderByZip(); }
}
