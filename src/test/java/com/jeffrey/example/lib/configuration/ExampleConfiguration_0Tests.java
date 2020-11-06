package com.jeffrey.example.lib.configuration;

import com.jeffrey.example.lib.bean.ExampleBean1;
import com.jeffrey.example.lib.bean.ExampleBean2;
import com.jeffrey.example.lib.config.ExampleConfiguration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class) // same as @RunWith(SpringJUnit4ClassRunner.class)
public class ExampleConfiguration_0Tests {

	private AnnotationConfigApplicationContext context;

	@BeforeEach
	public void setUp() throws Exception {
		this.context = new AnnotationConfigApplicationContext();
	}

	@AfterEach
	public void tearDown() throws Exception {
		if (this.context != null) {
			this.context.close();
		}
	}

	@Test
	public void bean1() {
		this.context.register(ExampleConfiguration.class);
		this.context.refresh();
		ExampleBean1 bean1 = this.context.getBean(ExampleBean1.class);
		assertTrue(bean1.invoke());
	}

	@Test
	public void bean2() {
		this.context.register(ExampleConfiguration.class);
		this.context.refresh();
		ExampleBean2 bean2 = this.context.getBean(ExampleBean2.class);
		assertTrue(bean2.invoke());
	}
}
