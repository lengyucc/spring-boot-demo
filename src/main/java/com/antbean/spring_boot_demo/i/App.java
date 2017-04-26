package com.antbean.spring_boot_demo.i;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

		applicationContext.getEnvironment().setActiveProfiles("prod");
		applicationContext.register(Config.class);
		applicationContext.refresh();

		DemoBean demoBean = applicationContext.getBean(DemoBean.class);
		System.out.println(demoBean);

		applicationContext.close();
	}
}
