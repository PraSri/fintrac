package com.prasri.fintrac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class FintracApplication {

	public static void main(String[] args) {
		SpringApplication.run(FintracApplication.class, args);
	}

}
