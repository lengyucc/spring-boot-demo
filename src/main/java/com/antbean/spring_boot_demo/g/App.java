package com.antbean.spring_boot_demo.g;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		Config config = applicationContext.getBean(Config.class);
		config.outputResource();
		applicationContext.close();
	}
}
