package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements ApplicationRunner {

    @Autowired     //Field Injection
    HelloBean bean;
    int a=10;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        bean.sayHello();
    }
}
