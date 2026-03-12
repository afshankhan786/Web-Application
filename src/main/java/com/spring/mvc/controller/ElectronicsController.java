package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/electronics")
public class ElectronicsController {
	
//@RequestMapping	(value="/login",method = RequestMethod.GET)
	@GetMapping("/")
	public String greeting() {
    System.out.println("WelcomeController.greeting()");
	return "electronic-home";
	
	}
	
//	
//	@GetMapping("/singUp")
//	public String singUP(@RequestParam(name="name",defaultValue = "Guest") String userN, Model model) {
//	 model.addAttribute("userN", userN);	
//    System.out.println("WelcomeController.greeting()"+userN);
//	return "success";
//	
//	}
	
}

