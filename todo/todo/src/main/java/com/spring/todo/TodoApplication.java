package com.spring.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TodoApplication {
	
	@Bean
	public A beanA() {
		return new A();
	}
	@Bean
	public B beanB() {
		return new B();
	}
	
	

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(TodoApplication.class, args);
		
		A bean = context.getBean(A.class);
		bean.m2();
	}

}
