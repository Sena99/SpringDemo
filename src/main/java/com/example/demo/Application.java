package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("Helloworld");
		//Address add=context.getBean(Address.class);
		//System.out.println(add.FetchAddress());
		Employee add=context.getBean(Employee.class);
		add.disply();
	}

}

