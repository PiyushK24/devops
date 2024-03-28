package com.nagarro.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@RestController
@RequestMapping("/api")

public class MyController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }

   @PostMapping("/greet")
    public String greetWithName(@RequestParam String name) {
        return "Hello, " + name + "!"
    }

}
