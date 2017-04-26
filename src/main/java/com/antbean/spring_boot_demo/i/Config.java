package com.antbean.spring_boot_demo.i;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Config {

	@Bean
	@Profile("dev")
	public DemoBean devDemoBean() {
		return new DemoBean("dev bean");
	}
	
	@Bean
	@Profile("prod")
	public DemoBean prodDemoBean() {
		return new DemoBean("prod bean");
	}

}
