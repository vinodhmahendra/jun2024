package com.simplilearn;

import com.simplilearn.model.Employee;
import com.simplilearn.repository.EmployeeRepositoryImpl;
import com.simplilearn.service.EmployeeService;
import com.simplilearn.service.EmployeeServiceImpl;

public class Program {
	
	
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeServiceImpl(new EmployeeRepositoryImpl());
		
		
		//save the data
		Employee employee1 = new Employee("1", "vinodh", "Sales");
		employeeService.addEmployee(employee1);
		Employee employee2 = new Employee("2", "Bhavya", "Sales");
		employeeService.addEmployee(employee2);
		
		
		
		employeeService.getAllEmployees().forEach(e -> System.out.println(e.getName()));
	}

}
