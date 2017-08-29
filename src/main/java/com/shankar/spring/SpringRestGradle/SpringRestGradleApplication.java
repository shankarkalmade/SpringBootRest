package com.shankar.spring.SpringRestGradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.shankar.spring.dbrepos")
@EntityScan("com.shankar.spring.models")
@ComponentScan({"com.shankar.spring.security", "com.shankar.spring.controllers"})
public class SpringRestGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestGradleApplication.class, args);
	}
}
