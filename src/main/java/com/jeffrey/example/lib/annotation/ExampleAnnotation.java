package com.jeffrey.example.lib.annotation;

import com.jeffrey.example.lib.config.ExampleConfiguration;
import com.jeffrey.example.lib.service.ExampleService;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({
		ExampleConfiguration.class,
		ExampleService.class
})
public @interface ExampleAnnotation {
}
