package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
	
	
}
