package com.pro.demoClrApplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
public class MyRunner implements CommandLineRunner {
   @Value("${ename}")
   String userName;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(Arrays.asList(args));
        System.out.println(userName);
    }
}
