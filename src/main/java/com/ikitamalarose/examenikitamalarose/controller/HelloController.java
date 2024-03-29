package com.ikitamalarose.examenikitamalarose.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("welcome")
    public String getMessage(){
        return "welcome to our application";
    }
}
