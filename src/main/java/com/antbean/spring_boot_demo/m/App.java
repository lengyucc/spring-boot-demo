package com.antbean.spring_boot_demo.m;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

//		applicationContext.close();
	}
}
