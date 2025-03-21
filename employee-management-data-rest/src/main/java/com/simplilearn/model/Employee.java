package com.simplilearn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employee {
	
	@Id
	private String id;
	
	@NotBlank(message= "Name must not be empty")
	@Size(min = 2, max = 100 , message = "Name must be between 2 and 100 characters")
	@Column(nullable = false,length = 100)
	private String name;
	
	@NotBlank(message= "Department must not be empty")
	@Column(nullable = false,length = 100)
	private String department;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	

}
