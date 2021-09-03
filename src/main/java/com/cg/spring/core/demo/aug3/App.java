package com.cg.spring.core.demo.aug3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Vaman Deshmukh
 *
 */

// Spring container 
// IoC 
// DI 

public class App {
	public static void main(String[] args) {

		System.out.println("Start");

//		Employee employee = new Employee();
//		Employee employee = hey Spring container, get me the object;

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Employee employee = context.getBean("employee", Employee.class);
		employee.work();

		System.out.println("End");

	}
}
