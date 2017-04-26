package com.antbean.spring_boot_demo.m;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
	private static final DateFormat DF = new SimpleDateFormat("HH:mm:ss");

	@Scheduled(fixedRate = 3000)
	public void executeTask1() {
		System.out.println("3s执行一次：" + DF.format(new Date()));
	}

	@Scheduled(cron = "0 00 15 ? * *")
	public void executeTask2() {
		System.out.println("执行时间执行：" + DF.format(new Date()));
	}

}
