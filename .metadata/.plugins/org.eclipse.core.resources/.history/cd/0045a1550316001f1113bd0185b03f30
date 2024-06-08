package com.simplilearn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.simplilearn.repository.EmployeeRepository;
import com.simplilearn.repository.EmployeeRepositoryImpl;
import com.simplilearn.service.EmployeeService;
import com.simplilearn.service.EmployeeServiceImpl;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public EmployeeRepository employeeRepository() {
		return new EmployeeRepositoryImpl();
	}

	@Bean
	public EmployeeService employeeService() {
		return new EmployeeServiceImpl(employeeRepository());
	}
}
