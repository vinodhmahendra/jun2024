package com.simplilearn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.simplilearn.model.Employee;
import com.simplilearn.service.EmployeeService;

@SpringBootApplication
public class EmployeeManagementRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementRestApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(EmployeeService employeeService) {
		return args -> {
			employeeService.addEmployee(new Employee("1", "Vinodh", "Training"));
			employeeService.addEmployee(new Employee("2", "Bhavya", "Development"));
			employeeService.addEmployee(new Employee("3", "Samarth", "HR"));
		};
	}
}
