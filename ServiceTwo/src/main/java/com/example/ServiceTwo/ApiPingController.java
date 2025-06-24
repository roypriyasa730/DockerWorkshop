package com.example.ServiceTwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicetwo/ping")
public class ApiPingController {
    @GetMapping
    public String get(){
        return "Hi, I am ServiceTwo";
    }
}
