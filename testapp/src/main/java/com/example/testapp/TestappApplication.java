package com.example.testapp;

import com.example.testapp.service.TestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestappApplication {


	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TestappApplication.class, args);

		//test bean
		TestService testService = context.getBean(TestService.class);
		testService.run();


	}
}
