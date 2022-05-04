package com.ola.test.controller;

import com.ola.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public String getUser() {
        userService.userServiceIn();
        return "ok";
    }
}
