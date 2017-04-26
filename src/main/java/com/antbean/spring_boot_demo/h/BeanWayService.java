package com.antbean.spring_boot_demo.h;

public class BeanWayService {

	public void init() {
		System.out.println("BeanWayService.init()");
	}

	public BeanWayService() {
		super();
		System.out.println("BeanWayService.BeanWayService()");
	}

	public void destroy() {
		System.out.println("BeanWayService.destroy()");
	}

}
