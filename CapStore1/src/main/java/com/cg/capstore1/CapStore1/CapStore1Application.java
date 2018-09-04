package com.cg.capstore1.CapStore1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.cg.capstore1.beans")
@ComponentScan("com.cg.capstore1")
@EnableJpaRepositories("com.cg.capstore1.repo")
public class CapStore1Application {

	public static void main(String[] args) {
		SpringApplication.run(CapStore1Application.class, args);
	}
}
