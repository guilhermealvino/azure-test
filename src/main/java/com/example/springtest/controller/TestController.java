package com.example.springtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping
    public Object hello() {
        Map<String, String> object = new HashMap<>();
        object.put("name", "Guilherme");
        object.put("email", "123@gmail.com");
        return object;
    }

    @GetMapping("/message")
    public String message(){
        return "Alowww ! Consegui chegar na Azure!";
    }
}
