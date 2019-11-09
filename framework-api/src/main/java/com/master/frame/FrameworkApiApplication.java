package com.master.frame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FrameworkApiApplication {


	public static void main(String[] args) {
		SpringApplication.run(FrameworkApiApplication.class, args);
	}

}
