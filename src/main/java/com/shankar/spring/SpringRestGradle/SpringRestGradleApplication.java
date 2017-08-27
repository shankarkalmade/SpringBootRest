package com.shankar.spring.SpringRestGradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.shankar.spring.controllers")
public class SpringRestGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestGradleApplication.class, args);
	}
}
