package com.penta.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //hello world
  
    // new line being added
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/hello/bangla")
    public String helloBangladesh() {
        return "Hello, Bangladesh!";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "Goodbye, World!";
    }
}
