package com.example.smartschool;

import com.example.smartschool.controller.Mutation;
import com.example.smartschool.controller.Query;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SmartschoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartschoolApplication.class, args);
	}

	@Bean
	public Query query() {
		return new Query();
	}

	@Bean
	public Mutation mutation() {
		return new Mutation();
	}
}
