package com.example.ServiceOne;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ping")
public class ApiPingController {

    @GetMapping
    public String get(){
        return "Hi, I am ServiceOne";
    }
}
