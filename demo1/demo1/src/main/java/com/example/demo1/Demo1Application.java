package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo1Application {

	//static  HelloBean helloBean;

	/*public Demo1Application(HelloBean helloBean){
		this.helloBean=helloBean;
	}*/                   //Constructor Injection

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(Demo1Application.class, args);
		//HelloBean obj=context.getBean(HelloBean.class);
		//obj.sayHello();
		//helloBean.sayHello();
	}

}
