package com.jeffrey.example.lib.bean;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Verify standalone bean behavior as plain java class using Junit
 */
public class ExampleBean1_Tests {

	@Test
	void verifyBean1() {
		ExampleBean1 exampleBean1 = new ExampleBean1();
		assertTrue(exampleBean1.invoke());
	}

}
