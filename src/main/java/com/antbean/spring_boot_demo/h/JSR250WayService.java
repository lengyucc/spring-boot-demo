package com.antbean.spring_boot_demo.h;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {

	@PostConstruct // 在构造函数执行完之后执行
	public void init() {
		System.out.println("JSR250WayService.init()");
	}

	public JSR250WayService() {
		super();
		System.out.println("JSR250WayService.JSR250WayService()");
	}

	@PreDestroy // 在bean销毁之前执行
	public void destroy() {
		System.out.println("JSR250WayService.destroy()");
	}

}
