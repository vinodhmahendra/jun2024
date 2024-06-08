package com.simplilearn.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.simplilearn.model.Employee;

@Repository(value = "employeeRepository")
public class EmployeeRepositoryImpl implements EmployeeRepository {

	private List<Employee> employees = new ArrayList<Employee>();

	public void addEmployee(Employee employee) {
		employees.removeIf(e -> e.getId().equals(employee.getId()));
		employees.add(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return new ArrayList<Employee>(employees);
	}

	@Override
	public Optional<Employee> getEmployeeById(String id) {
		return employees.stream().filter(e -> e.getId().equals(id)).findFirst();		
	
	}

	@Override
	public void updateEmployee(Employee employee) {
		employees.replaceAll(e -> e.getId().equals(employee.getId()) ? employee : e);
	}

	@Override
	public void deleteEmployee(String id) {
		employees.removeIf(e -> e.getId().equals(id));

	}
}
