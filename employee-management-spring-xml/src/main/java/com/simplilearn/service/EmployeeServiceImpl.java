package com.simplilearn.service;

import java.util.List;
import java.util.Optional;

import com.simplilearn.model.Employee;
import com.simplilearn.repository.EmployeeRepository;

public class EmployeeServiceImpl  implements EmployeeService{
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl() {
		
		
		System.out.println("constructor called");
		
	}
	
	//constructor
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		System.out.println("spring called parameterized constructor to inject repository bean");
		this.employeeRepository = employeeRepository;
	}
	
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("spring called parameterized setter to inject repository bean");
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public void addEmployee(Employee employee) {
		employeeRepository.addEmployee(employee);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.getAllEmployees();
	}
	
	@Override
	public Optional<Employee> getEmployeeById(String id) {
		// TODO Auto-generated method stub
		return employeeRepository.getEmployeeById(id);
	}
	
	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.updateEmployee(employee);
	}
	
	@Override
	public void deleteEmployee(String id) {
		employeeRepository.deleteEmployee(id);
	}

}
