package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.capg.controller")
@ComponentScan("com.capg.dao")
@ComponentScan("com.capg.service")
@ComponentScan("com.capg.model")
@EntityScan(basePackages = {"com.capg.model"})
@SpringBootApplication
public class SpringBootTdsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTdsApplication.class, args);
	}

}
