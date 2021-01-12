package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping( method = RequestMethod.GET, params = {"name"})
    public User getUserByName(@RequestParam String name) {
        return userService.getUserByName(name);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void postUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @RequestMapping(value ="/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable("id") int id) {
        return userService.getUserById(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteUserById(@PathVariable int id){
        userService.deleteUserById(id);
    }
}

