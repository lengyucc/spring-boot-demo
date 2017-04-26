package com.antbean.spring_boot_demo.j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
	@Autowired
	private ApplicationContext applicationContext;

	public void send(String msg) {
		System.out.println("发送消息：" + msg);

		applicationContext.publishEvent(new DemoEvent(this, msg));
	}
}
