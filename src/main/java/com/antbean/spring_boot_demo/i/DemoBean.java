package com.antbean.spring_boot_demo.i;

public class DemoBean {

	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public DemoBean(String content) {
		super();
		this.content = content;
	}

	@Override
	public String toString() {
		return "DemoBean [content=" + content + "]";
	}

}
