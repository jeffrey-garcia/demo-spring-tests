package com.jeffrey.example.lib.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Verify the instantiation of ExampleService using ContextConfiguration and properties defined in the test
 * Autowire an application context to verify the service instantiation instead of
 * autowiring the service itself
 */
@TestPropertySource(
		properties = {
				"com.jeffrey.example.ExampleService.enabled=false"
		}
)
@ContextConfiguration(classes = {ExampleService.class})
@ExtendWith(SpringExtension.class) // same as @RunWith(SpringJUnit4ClassRunner.class)
public class ExampleService_1IT {

	@Autowired
	ApplicationContext applicationContext;

	@Test
	void verifyService() {
		assertThrows(NoSuchBeanDefinitionException.class, () -> {
			applicationContext.getBean(ExampleService.class);
		});
	}

}
