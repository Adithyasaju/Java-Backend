package com.prostack.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    HelloBean bean;
    int x;
    @Override
    public void run(String... args) throws Exception {
    bean.sayHello();
    }
}
