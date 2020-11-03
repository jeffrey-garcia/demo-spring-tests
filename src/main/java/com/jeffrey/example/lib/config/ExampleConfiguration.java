package com.jeffrey.example.lib.config;

import com.jeffrey.example.lib.bean.ExampleBean1;
import com.jeffrey.example.lib.bean.ExampleBean2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleConfiguration {

	ExampleConfiguration() {
	}

	@Bean
	public ExampleBean1 bean1() {
		return new ExampleBean1();
	}

	@Bean
	public ExampleBean2 bean2(@Autowired ExampleBean1 bean1) {
		return new ExampleBean2(bean1);
	}
}
