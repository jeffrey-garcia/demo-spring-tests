package com.jeffrey.example.app;

import com.jeffrey.example.lib.annotation.ExampleAnnotation;
import com.jeffrey.example.lib.bean.ExampleBean1;
import com.jeffrey.example.lib.config.ExampleConfiguration;
import com.jeffrey.example.lib.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@ExampleAnnotation
@SpringBootApplication
public class DemoSpringTestsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringTestsApplication.class, args);
	}

	@Autowired
	ExampleBean1 bean1;

	@Autowired
	ExampleBean1 bean2;

	@Autowired
	ExampleService exampleService;

}
