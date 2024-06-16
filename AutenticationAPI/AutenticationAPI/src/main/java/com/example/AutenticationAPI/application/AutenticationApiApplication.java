package com.example.AutenticationAPI.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class AutenticationApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutenticationApiApplication.class, args);
	}

}
