package com.test.springbootdemoapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    //Injecting custom properties
    @Value("${coach.name}")
    private String coachname;
    @GetMapping("/")
    public String Hello(){
        return "Hello";
    }
}
