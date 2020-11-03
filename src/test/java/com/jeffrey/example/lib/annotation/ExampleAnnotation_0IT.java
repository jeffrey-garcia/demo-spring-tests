package com.jeffrey.example.lib.annotation;

import com.jeffrey.example.lib.bean.ExampleBean1;
import com.jeffrey.example.lib.service.ExampleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Verify custom annotation using a spring boot app and properties defined in the test.
 * Autowire an ApplicationContext to verify service/bean instantiation
 */
@TestPropertySource(
		properties = {
				"com.jeffrey.example.ExampleService.enabled=true"
		}
)
@SpringBootTest(classes = ExampleAnnotation_0IT.App.class)
public class ExampleAnnotation_0IT {

	@ExampleAnnotation
	@SpringBootApplication
	static class App { }

	@Autowired
	ApplicationContext applicationContext;

	@Test
	void verifyService() {
		assertNotNull(applicationContext.getBean(ExampleService.class));
	}

	@Test
	void verifyBean1() {
		assertNotNull(applicationContext.getBean(ExampleBean1.class));
	}

}
