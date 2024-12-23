package com.example.demo1;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {
    public void  sayHello(){
        System.out.println("Welcome to springboot");
    }
}
