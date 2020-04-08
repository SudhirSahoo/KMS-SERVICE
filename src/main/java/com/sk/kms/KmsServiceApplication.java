package com.sk.kms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.sk.kms")
public class KmsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KmsServiceApplication.class, args);
	}

}
