package com.example.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class PersonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonApplication.class, args);
	}
}
