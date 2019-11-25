package com.ids.idsclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan(basePackages = "com.ids.idsclient.controller")

public class IdsclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdsclientApplication.class, args);
	}

}
