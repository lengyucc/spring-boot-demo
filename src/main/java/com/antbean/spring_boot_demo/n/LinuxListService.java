package com.antbean.spring_boot_demo.n;

public class LinuxListService implements ListService {

	@Override
	public String showListCmd() {
		return "ls";
	}

	public LinuxListService() {
		super();
		System.out.println("LinuxListService.LinuxListService()");
	}

}
