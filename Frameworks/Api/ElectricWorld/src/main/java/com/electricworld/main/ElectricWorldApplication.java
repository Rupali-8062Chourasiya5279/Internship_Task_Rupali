package com.electricworld.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElectricWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectricWorldApplication.class, args);
		System.out.println("Project started ");
	}

}
