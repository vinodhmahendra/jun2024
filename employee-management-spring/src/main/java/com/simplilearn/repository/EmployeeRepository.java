package com.simplilearn.repository;

import java.util.List;
import java.util.Optional;

import com.simplilearn.model.Employee;

public interface EmployeeRepository {
	
	void addEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Optional<Employee> getEmployeeById(String id);
	void updateEmployee(Employee employee);
	void deleteEmployee(String id);

}
