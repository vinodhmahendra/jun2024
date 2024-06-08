package com.simplilearn.service;
import java.util.List;
import java.util.Optional;

import com.simplilearn.model.Employee;

public interface EmployeeService {
	
	void addEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Optional<Employee> getEmployeeById(String id);
	void updateEmployee(Employee employee);
	void deleteEmployee(String id);

}