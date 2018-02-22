package com.example.testapp;

import com.example.testapp.configuration.ConfigService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestappApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = SpringApplication.run(TestappApplication.class, args);
		//test
		ConfigService configService = app.getBean(ConfigService.class);
		configService.printFooProperties();
	}
}
