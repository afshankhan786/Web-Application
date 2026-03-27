package com.spring.mvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.model.Employee;

@Controller
public class AdminController {
	
	
	static Map<Integer,Employee> map=null;
	static 	int empId=0;

	static {
		 map = new HashMap<>();
		 map.put(++empId, new Employee (empId,"Mukash", "IT","Noida"));
		 map.put(++empId, new Employee (empId,"Shurash", "IOT","Noida"));
		 map.put(++empId, new Employee (empId,"Mahash", "AI","Noida"));
		 map.put(++empId, new Employee (empId,"Nirash", "JEE","Noida"));
		 map.put(++empId, new Employee (empId,"Nitesh", "BBC","Noida"));

		 
	}
	
	
	
	@GetMapping("/")
	public String Welcome() {
		System.out.println("AdminController.Welcome()");
		return "index";
	}
	
	@GetMapping("/sing-up")
	public String SingUpForm(){
	 System.out.println("AdminController.up()");
	return "sing-up";
	}
	
	

	@PostMapping("/singupAdmin")
	public String postAdmin(@RequestParam(name = "adminname")String adminname,@RequestParam(name = "department")String department,@RequestParam(name = "address")String adderss,Model model) {
		
		System.out.println("adminname :"+ adminname);
		System.out.println("department :"+department);
		System.out.println("adderss :" +adderss);
		
		model.addAttribute("adminname", adminname);
		model.addAttribute("department",department);
		model.addAttribute("adderss", adderss);
		
		return "success";
		
	}
	
	@PostMapping("/creatAdmin")
	public String creatAdmin(@ModelAttribute Employee emp,Model model) {
		System.out.println(emp);
		emp.setId(++empId);
		map.put(empId, emp);
		return "success";
		
	}
	
	
	@GetMapping("/getEmpById/{id}")
	public String getEmp(@PathVariable(name = "id") int id,Model model) {
		Employee e = map.get(id);
		model.addAttribute("employee",e);
		return "success";
		
	}
	
	
}
