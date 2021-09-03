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

//		Employee obj = context.getBean(Employee.class);
		Employee obj = context.getBean("employee2", Employee.class);
//		obj.work();
		System.out.println(obj.toString());

		Employee obj3 = context.getBean("employee3", Employee.class);
		System.out.println(obj3.toString());

		System.out.println("End");

	}
}
