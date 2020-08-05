package com.poc.wso2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.poc")
public class WSO2POCApplication {

	public static void main(String[] args) {
		SpringApplication.run(WSO2POCApplication.class, args);
	}

}

