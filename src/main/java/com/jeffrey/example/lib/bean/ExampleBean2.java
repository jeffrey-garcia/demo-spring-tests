package com.jeffrey.example.lib.bean;

public class ExampleBean2 {
	private ExampleBean1 bean1;

	public ExampleBean2(ExampleBean1 bean1) {
		this.bean1 = bean1;
	}

	public boolean invoke() {
		return bean1.invoke();
	}
}
