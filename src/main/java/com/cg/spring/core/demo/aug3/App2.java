package com.cg.spring.core.demo.aug3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class App2 {

	public static void main(String[] args) {

		System.out.println("Start");

		ApplicationContext context = 
		new AnnotationConfigApplicationContext(App2.class);
		Customer customer = context.getBean(Customer.class);
		customer.buy();

		System.out.println("End");

	}

}
