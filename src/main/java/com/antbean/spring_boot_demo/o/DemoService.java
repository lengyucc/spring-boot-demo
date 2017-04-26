package com.antbean.spring_boot_demo.o;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	public void print(Object obj) {
		System.out.println(obj);
	}

}
