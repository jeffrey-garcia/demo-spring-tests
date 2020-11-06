package com.jeffrey.example.lib.configuration;

import com.jeffrey.example.lib.bean.ExampleBean1;
import com.jeffrey.example.lib.bean.ExampleBean2;
import com.jeffrey.example.lib.config.ExampleConfiguration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;

/**
 * Verify the instantiation of ExampleConfiguration using Mock
 */
@ExtendWith(SpringExtension.class) // same as @RunWith(SpringJUnit4ClassRunner.class)
public class ExampleConfiguration_1Tests {

	@Mock
	ExampleBean1 bean1;

	@InjectMocks
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
		// mock bean 1 is NOT reused!!!
		Mockito.verify(bean1, times(1)).invoke();
	}

}
