package com.jeffrey.example.app;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockStatic;

/**
 * Verify Spring main app startup using static mockito
 */
public class DemoSpringTestsApplication_1IT {

	@Test
	public void appStarted() {
		try (MockedStatic mocked = mockStatic(DemoSpringTestsApplication.class)) {
			DemoSpringTestsApplication.main(new String[]{});
			mocked.verify(() -> DemoSpringTestsApplication.main(any(String[].class)));
		}
	}
}
