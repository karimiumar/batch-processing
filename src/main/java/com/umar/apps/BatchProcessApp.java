package com.umar.apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BatchProcessApp {

	public static void main(String[] args) {

		System.exit(SpringApplication.exit(SpringApplication.run(BatchProcessApp.class, args)));
	}

}
