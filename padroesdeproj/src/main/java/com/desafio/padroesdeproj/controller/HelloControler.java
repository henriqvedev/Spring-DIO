package com.desafio.padroesdeproj.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @GetMapping("/")
    public String hello(){
        return "API TA ON";
    }
}
