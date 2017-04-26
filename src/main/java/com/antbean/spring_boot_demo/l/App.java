package com.antbean.spring_boot_demo.l;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

		AsyncService service = applicationContext.getBean(AsyncService.class);
		for (int i = 0; i < 18; i++) {
			service.executeAsyncTask(i);
			service.executeAsyncTaskPuls(i);
		}

		applicationContext.close();
	}
}
