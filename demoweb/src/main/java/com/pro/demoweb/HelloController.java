package com.pro.demoweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello GM";
    }
    @GetMapping("/hello")
    public String sayGoodBye(){
        return "Hello,GoodBye";
    }
}
