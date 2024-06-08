package com.simplilearn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.simplilearn.model.Employee;
import com.simplilearn.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	//URL : http://localhost:8080/employees
	//HTTP Method : GET
	@GetMapping("/employees")
	public String showEmployeeList(Model model) {
		model.addAttribute("employees", employeeService.getAllEmployees()); // model = data (key = value)
		return "employeeList"; // Logical view name (WEB-INF/views/employeeList.jsp
	}
	
	
	@GetMapping("/employees/add")
	public String showAddForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "employeeForm";
	}
	
	
	@PostMapping("/employees/add")
	public String addEmployee(@ModelAttribute Employee employee) {
		employeeService.addEmployee(employee);
		return "redirect:/employees";
	}
	
	@PostMapping("/employees/edit")
	public String updateEmployee(@ModelAttribute Employee employee) {
		employeeService.updateEmployee(employee);
		return "redirect:/employees";
	}
	
	@GetMapping("/employees/edit/{id}")
	public String showEditForm(@PathVariable("id") String id,Model model) {
		Employee employee = employeeService.getEmployeeById(id).get();
		if ( employee == null) {
			return "redirect:/employees";
		}
		model.addAttribute("employee", employee);
		return "employeeForm";
	}
	
	
	@GetMapping("/employees/delete/{id}")
	public String deleteEmployee (@PathVariable("id") String id) {
		employeeService.deleteEmployee(id);
		return "redirect:/employees";
	}
	

}
