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
}
