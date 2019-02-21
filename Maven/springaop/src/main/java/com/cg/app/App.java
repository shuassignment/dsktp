package com.cg.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.app.service.Calculator;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Calculator calculator = context.getBean(Calculator.class);
		calculator.add(100, 200);
		calculator.sub(200, 50);
		try {
			calculator.exception();
		} catch (Exception e) {
//			e.printStackTrace();
		}
	}
}
