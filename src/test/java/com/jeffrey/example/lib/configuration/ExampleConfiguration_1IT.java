package com.jeffrey.example.lib.configuration;


import com.jeffrey.example.lib.bean.ExampleBean1;
import com.jeffrey.example.lib.bean.ExampleBean2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;

/**
 * Verify beans dependency behavior using a stub configuration define in the test
 */
@ExtendWith(SpringExtension.class) // same as @RunWith(SpringJUnit4ClassRunner.class)
public class ExampleConfiguration_1IT {

	@Configuration
	static class StubConfig {
		@Bean
		ExampleBean1 bean1() {
			return Mockito.mock(ExampleBean1.class);
		}

		@Bean
		ExampleBean2 bean2(ExampleBean1 bean1) {
			return new ExampleBean2(bean1);
		}
	}

	@Autowired
	ExampleBean1 bean1;

	@Autowired
	ExampleBean2 bean2;

	@Test
	void verifyBean1() {
		boolean mockResult = false;
		Mockito.when(bean1.invoke()).thenReturn(mockResult);
		assertEquals(mockResult, bean1.invoke());
		Mockito.verify(bean1, times(1)).invoke();
	}

	@Test
	void verifyBean2() {
		boolean mockResult = false;
		Mockito.when(bean1.invoke()).thenReturn(mockResult);
		assertEquals(mockResult, bean2.invoke());
		// mock bean 1 is re-used!!!
		Mockito.verify(bean1, times(2)).invoke();
	}

}
