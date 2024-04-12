package com.bank.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.api.model.User;
import com.bank.api.services.UserService;

@RestController // This means that this class is a Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/api/users/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userService.findAll();
    }

 
}