package com.antbean.spring_boot_demo.h;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		BeanWayService beanWayService = applicationContext.getBean(BeanWayService.class);
		JSR250WayService jsr250WayService = applicationContext.getBean(JSR250WayService.class);
		applicationContext.close();
	}
}
