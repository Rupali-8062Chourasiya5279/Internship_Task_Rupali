package com.quickservemain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuickServeApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickServeApplication.class, args);
		System.out.println("Project started ....");
	}
}
