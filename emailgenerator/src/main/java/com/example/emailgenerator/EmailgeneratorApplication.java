package com.example.emailgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EmailgeneratorApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmailgeneratorApplication.class, args);
	}
}
