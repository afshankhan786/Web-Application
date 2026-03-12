package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/grocery")
public class GroceryController {
	
//@RequestMapping	(value="/login",method = RequestMethod.GET)
	@GetMapping("/")
	public String greeting() {
    System.out.println("WelcomeController.greeting()");
	return "grocery-home";
	
	}
	
	
	@GetMapping("/sing-up")
	public String createUser(@RequestParam("user") String userN, Model model) {
	 model.addAttribute("user", userN);	
    System.out.println("WelcomeController.greeting()");
	return "success";
	
	}
	
}

