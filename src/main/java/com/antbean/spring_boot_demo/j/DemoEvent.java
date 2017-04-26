package com.antbean.spring_boot_demo.j;

import org.springframework.context.ApplicationEvent;

public class DemoEvent extends ApplicationEvent {
	private static final long serialVersionUID = 5912762032178983065L;
	private String msg;

	public DemoEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
