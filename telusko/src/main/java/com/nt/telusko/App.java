package com.nt.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nt/config/applicationContext.xml");
		Employee employee = ctx.getBean("employee", Employee.class);
		System.out.println(employee);

	}
}
