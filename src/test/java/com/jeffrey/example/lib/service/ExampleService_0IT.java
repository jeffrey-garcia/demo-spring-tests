package com.jeffrey.example.lib.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Verify the instantiation of ExampleService using ContextConfiguration and properties defined in the test
 */
@TestPropertySource(
		properties = {
				"com.jeffrey.example.ExampleService.enabled=true"
		}
)
@ContextConfiguration(classes = {ExampleService.class})
@ExtendWith(SpringExtension.class) // same as @RunWith(SpringJUnit4ClassRunner.class)
public class ExampleService_0IT {

	@Autowired
	ExampleService exampleService;

	@Test
	public void verifyExecute() {
		assertTrue(exampleService.execute());
	}

}
