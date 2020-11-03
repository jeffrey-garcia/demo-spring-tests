package com.jeffrey.example.lib.configuration;

import com.jeffrey.example.lib.bean.ExampleBean1;
import com.jeffrey.example.lib.config.ExampleConfiguration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Verify the instantiation of ExampleConfiguration using ContextConfiguration
 */
@ContextConfiguration(classes = ExampleConfiguration.class)
@ExtendWith(SpringExtension.class) // same as @RunWith(SpringJUnit4ClassRunner.class)
public class ExampleConfiguration_0IT {

	@Autowired
	ApplicationContext applicationContext;

	@Test
	void verifyBean1() {
		ExampleBean1 bean1 = applicationContext.getBean(ExampleBean1.class);
		assertNotNull(bean1);
		assertTrue(bean1.invoke());
	}

}
