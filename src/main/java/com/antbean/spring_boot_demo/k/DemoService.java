package com.antbean.spring_boot_demo.k;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class DemoService implements BeanNameAware, ResourceLoaderAware {
	private ResourceLoader resourceLoader;
	private String beanName;

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public void outputResult() throws IOException {
		System.out.println("bean name:\t" + beanName);
		Resource resource = resourceLoader.getResource("classpath:com/antbean/spring_boot_demo/k/note.txt");
		System.out.println(IOUtils.toString(resource.getInputStream()));
	}
}
