package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {

	@Value("${app.name}")
    private String name;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return application.sources(DemoApplication.class);
    }

    @RequestMapping("/")
    public String hello() {
        return "Hello, World!";
    }

    @RequestMapping("/about")
    public String about() {
        return "<p> HI! <h2>About page  <h2><p>";
    }

	@RequestMapping("/name")
    public String name() {
        return name;
    }
	@GetMapping("/greet/{name}")
    public String greet(@PathVariable String name){
        return "<h2> I am working with "+ name +"</h2>";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
