package com.example.hellospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hi() {
        return "hello String Boot!!";
    }

    @GetMapping("/")
    public String index() {
        return "처음 페이지 입니다.";
    }

    @GetMapping("/joowon22333")
    public String joowon() {
        return "joowon Page";
    }
}
