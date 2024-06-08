package com.simplilearn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.simplilearn.repository,com.simplilearn.service")
public class ApplicationConfig {
	
}
