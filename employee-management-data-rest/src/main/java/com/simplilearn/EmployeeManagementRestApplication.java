package com.simplilearn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.simplilearn.model.Employee;
import com.simplilearn.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeManagementRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementRestApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(EmployeeRepository employeeRepository) {
		return args -> {
			employeeRepository.save(new Employee("1", "Vinodh", "Training"));
			employeeRepository.save(new Employee("2", "Bhavya", "Development"));
			employeeRepository.save(new Employee("3", "Samarth", "HR"));
		};
	}
}
