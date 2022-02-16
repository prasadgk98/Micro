package com.example.coustomerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaServer
@SpringBootApplication
public class CoustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoustomerServiceApplication.class, args);
	}

}
