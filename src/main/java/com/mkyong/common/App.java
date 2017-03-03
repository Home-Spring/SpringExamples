package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @see https://www.mkyong.com/spring/spring-auto-wiring-beans-with-autowired-annotation/
 */

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

		Customer cust = (Customer) context.getBean("customer");
		System.out.println(cust);
	}
}