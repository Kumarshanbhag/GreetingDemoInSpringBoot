package com.bl.greeting.controller;

import com.bl.greeting.model.User;
import com.bl.greeting.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/greeting")
public class UserController {
    @Autowired
    IUserService userService;

    @GetMapping ("/welcome")
    public String welcome() {
        return "Welcome To Greeting Spring Boot";
    }

    @GetMapping ("/findalluser")
    public List<User> welcomeMessage() {
        return userService.getAllUser();
    }

    @PostMapping ("/add")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/deleteuser/{id}")
    public String deleteUser(@PathVariable int id) {
        return userService.deleteUser(id);
    }

    @DeleteMapping("/delete/{id}")
    public User delete(@PathVariable int id) {
        return userService.delete(id);
    }
}
