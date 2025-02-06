package com.railwayguide.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello From Railway spring application";
    }

    @GetMapping("/world")
    public String world() {
        return "Hello World";
    }

    @GetMapping("/hello")
    public String helloworld() {
        return "Hello my friend";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/caffeine")
    public String caffeine() {
        return "caffeine";
    }
}
