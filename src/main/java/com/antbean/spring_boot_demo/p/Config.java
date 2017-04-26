package com.antbean.spring_boot_demo.p;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Config {
	@Bean
	@Profile("dev")
	public TestBean devTestBean() {
		return new TestBean("from dev profile");
	}

	@Bean
	@Profile("prod")
	public TestBean prodTestBean() {
		return new TestBean("from prod profile");
	}
}
