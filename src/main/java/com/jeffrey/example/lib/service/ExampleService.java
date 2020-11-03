package com.jeffrey.example.lib.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(prefix = "com.jeffrey.example.ExampleService", name = "enabled", havingValue = "true")
public class ExampleService {

	public ExampleService() { }

	public boolean execute() {
		return true;
	}

}
