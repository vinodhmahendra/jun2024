package com.simplilearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.simplilearn.config.ApplicationConfig;
import com.simplilearn.model.Employee;
import com.simplilearn.service.EmployeeService;

public class Program {
	
	
	public static void main(String[] args) {
		
		//create a container object
		ApplicationContext container = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		
		//		EmployeeService employeeService = new EmployeeServiceImpl(new EmployeeRepositoryImpl());
		
		
		EmployeeService employeeService = container.getBean("employeeService", EmployeeService.class);
		
		
		//save the data
		Employee employee1 = new Employee("1", "vinodh", "Sales");
		employeeService.addEmployee(employee1);
		Employee employee2 = new Employee("2", "Bhavya", "Sales");
		employeeService.addEmployee(employee2);
		
		
		
		employeeService.getAllEmployees().forEach(e -> System.out.println(e.getName()));
	}

}
