package com.example.simplespringbootapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello! Current time is " + LocalDateTime.now();
    }

}
