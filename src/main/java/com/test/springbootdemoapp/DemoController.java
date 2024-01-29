package com.test.springbootdemoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a private field for the dependency injection
    private Coach myCoach;
    //define a constructor for the dependency injection
    @Autowired
    public DemoController(Coach theCoach){
        myCoach=theCoach;
    }
    @GetMapping("/dailyworkout")
    public String getDailyworkOut(){
        return myCoach.getDailyWorkout();
    }
}
