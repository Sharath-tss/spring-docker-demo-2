package com.datajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication{

	@GetMapping("/welcome")
	public String welcomeUser(){
		return "Hi, This is Sharath..!";
	}

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

	}


}
