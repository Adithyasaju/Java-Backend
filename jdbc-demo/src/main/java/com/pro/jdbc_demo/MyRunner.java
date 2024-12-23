package com.pro.jdbc_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    DatabaseDemo demo;



    @Override
    public void run(String... args) throws Exception {
        demo.insertData();
    }
}
