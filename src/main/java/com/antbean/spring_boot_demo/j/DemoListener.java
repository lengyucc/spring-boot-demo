package com.antbean.spring_boot_demo.j;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

	@Override
	public void onApplicationEvent(DemoEvent event) {
		System.out.println("监听到：" + event.getMsg());
	}

}
