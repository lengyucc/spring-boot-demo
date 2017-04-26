package com.antbean.spring_boot_demo.k;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

		DemoService service = applicationContext.getBean(DemoService.class);
		service.outputResult();

		applicationContext.close();
	}
}
