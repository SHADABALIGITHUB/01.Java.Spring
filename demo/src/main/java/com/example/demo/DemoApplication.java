package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DemoApplication {

	@RequestMapping("/")
	public String hello() {
		return "Hello, World!";
	}
	@RequestMapping("/about")
	public String about() {
		return "<h2>About page<h2>";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	
    

      
    

}
