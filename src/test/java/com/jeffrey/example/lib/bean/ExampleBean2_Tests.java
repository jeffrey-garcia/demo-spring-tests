package com.jeffrey.example.lib.bean;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Verify standalone bean behavior as plain java class using Junit
 */
public class ExampleBean2_Tests {

	@Test
	void verifyBean2() {
		ExampleBean2 exampleBean2 = new ExampleBean2(new ExampleBean1());
		assertTrue(exampleBean2.invoke());
	}

}
