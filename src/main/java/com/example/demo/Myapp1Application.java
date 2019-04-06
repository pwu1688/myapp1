package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Myapp1Application {

	public static void main(String[] args) {
		SpringApplication.run(Myapp1Application.class, args);
		System.out.println("my app1");
	}
	@RequestMapping("/")
	public String hello() {
		return "hello world";
	}
}
