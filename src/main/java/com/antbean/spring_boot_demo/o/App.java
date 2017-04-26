package com.antbean.spring_boot_demo.o;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

		DemoService service = applicationContext.getBean(DemoService.class);
		service.print(123213);

		applicationContext.close();
	}
}
