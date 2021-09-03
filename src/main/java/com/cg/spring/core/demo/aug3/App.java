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
//		Employee obj = context.getBean("employee", Employee.class);

		Employee obj = context.getBean(Employee.class);
		Employee obj2 = context.getBean(Employee.class);

		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());
		

		System.out.println(obj.equals(obj2));

		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
				
		obj.work();

		System.out.println("End");

	}
}
