package com.suni.infotech.springauth.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {

    @RequestMapping("/")
    public String hello(){
        return "Hello!! Welcome to Spring Security";
    }
}
