package com.spring.mvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.model.Employee;
import com.spring.mvc.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	
	@GetMapping("/")
	public String Welcome() {
		System.out.println("EmployeeController.Welcome()");
		return "index";
	}
	
	@GetMapping("/sing-up")
	public String SingUpForm(){
	System.out.println("EmployeeController.SingUpForm()");
	return "sing-up";
	}
	
	

	
	
	@PostMapping("/creatAdmin")
	public String creatAdmin(@ModelAttribute Employee emp,Model model) {
		employeeService.saveEmployee(emp); 
		return "success";
		
	}
	
	
	@GetMapping("/getEmpById/{id}")
	public String getEmp(@PathVariable(name = "id") int id,Model model) {
		return "success"; 
		
	}
	
	@GetMapping("/employees")
	public String listEmployees(Model model) {
		model.addAttribute("employees",employeeService.getAllEmployees());
		return "employeeList";
		
	}
	
}
