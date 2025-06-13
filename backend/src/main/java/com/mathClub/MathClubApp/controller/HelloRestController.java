package com.mathClub.MathClubApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @GetMapping("/world")
    public String sayHello(){
        return "Hello World";
    }
}
