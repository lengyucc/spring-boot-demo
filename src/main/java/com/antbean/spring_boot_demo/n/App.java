package com.antbean.spring_boot_demo.n;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

		ListService listService = applicationContext.getBean(ListService.class);
		System.out.println(listService.showListCmd());

		applicationContext.close();
	}
}
