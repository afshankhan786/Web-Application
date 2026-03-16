package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.model.Employee;

@Controller
public class AdminController {
	
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
	public String postAdmin(@RequestParam(name = "adminname")String adminname, @RequestParam(name ="adminage")String adminage,@RequestParam(name = "department")String department,@RequestParam(name = "address")String adderss,Model model) {
		
		System.out.println("adminname :"+ adminname);
		System.out.println("adminage :"+ adminage);
		System.out.println("department :"+department);
		System.out.println("adderss :" +adderss);
		
		model.addAttribute("adminname", adminname);
		model.addAttribute("adminage", adminage);
		model.addAttribute("department",department);
		model.addAttribute("adderss", adderss);
		
		return "success";
		
	}
	
	@PostMapping("/creatAdmin")
	public String creatAdmin(@ModelAttribute Employee employee) {
		System.out.println(employee);
		return "index";
		
	}
	
	
}
