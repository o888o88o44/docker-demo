package com.demo.docker_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
    	return "CI/CD AUTO DEPLOY 🔥🔥🔥";
    }
}