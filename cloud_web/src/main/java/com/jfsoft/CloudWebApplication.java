package com.jfsoft;

import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jfsoft.*.mapper")
public class CloudWebApplication {

	private static Logger logger = Logger.getLogger(CloudWebApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CloudWebApplication.class, args);
		logger.info("============= SpringBoot Start Success =============");
	}
}
