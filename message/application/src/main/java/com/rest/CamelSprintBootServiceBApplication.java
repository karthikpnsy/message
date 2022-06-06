package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class CamelSprintBootServiceBApplication extends SpringBootServletInitializer {
	private static Class<CamelSprintBootServiceBApplication> application = CamelSprintBootServiceBApplication.class;

	public static void main(String[] args) {
		SpringApplication.run(CamelSprintBootServiceBApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(application);
	}

	/*
	 * @GetMapping("/hello") public String sayHello() { return "reached here"; }
	 */
}
