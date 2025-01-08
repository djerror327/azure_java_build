package com.dinush.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserControler {

    @GetMapping("/v1/user")
    public String getData() {
        System.out.println("User data hit");
        return "userData: DinushaFromSpringboot";
    }
}
