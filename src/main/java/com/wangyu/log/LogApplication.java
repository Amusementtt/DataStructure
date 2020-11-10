package com.wangyu.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogApplication {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(LogApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LogApplication.class, args);
		log.error("这是王钰的信息");
		System.out.println("修改了语句");
	}

}
