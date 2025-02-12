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

    @GetMapping("/roasted")
    public String roasted() {
        return "roasted";
    }

    @GetMapping("/coding")
    public String coding() {
        return "coding";
    }

    @GetMapping("/jeez")
    public String jeez() {
        return "jeez";
    }

    @GetMapping("/testify")
    public String testify() {
        return "testify";
    }

    @GetMapping("/kebab")
    public String kebab() {
        return "kebab + pizza";
    }

    @GetMapping("/pizza")
    public String pizza() {
        return "pizza + roastbeef";
    }

    @GetMapping("/panini")
    public String panini() {
        return "panini";
    }

    @GetMapping("/mayo")
    public String mayo() {
        return "mayo + ketchup";
    }

    @GetMapping("/mustard")
    public String mustard() {
        return "mustard + mustard";
    }
}
