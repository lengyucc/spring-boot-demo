package com.antbean.spring_boot_demo.n;

public class WindowsListService implements ListService {

	@Override
	public String showListCmd() {
		return "dir";
	}

	public WindowsListService() {
		super();
		System.out.println("WindowsListService.WindowsListService()");
	}

}
