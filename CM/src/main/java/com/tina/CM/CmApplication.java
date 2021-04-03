package com.tina.CM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class CmApplication {

	public static void main(String[] args) {

		SpringApplication.run(CmApplication.class, args);
	}

}
