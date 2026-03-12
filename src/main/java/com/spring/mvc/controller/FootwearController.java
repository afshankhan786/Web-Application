package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/footwear")
public class FootwearController {
	
//@RequestMapping	(value="/login",method = RequestMethod.GET)
	@GetMapping("/")
	public String greeting() {
    System.out.println("WelcomeController.greeting()");
	return "footwear-home";
	
	}
	
	
//	@GetMapping("/sing-up")
//	public String createUser(@RequestParam("user") String userN, Model model) {
//	 model.addAttribute("user", userN);	
//    System.out.println("WelcomeController.greeting()");
//	return "success";
//	
//	}
	
	
	@GetMapping("/query")
	public String queryParam(@RequestParam(name = "user",defaultValue = "Guest") String name,Model model) {
		
		model.addAttribute("user", name);
		System.out.println("WelcomeController.queryPara : "+name);
		return "success";
	}
	
	
//	@GetMapping("/req-param")
//	public String createUser(@RequestParam(name="user",defaultValue ="MY-DEFAULT-NAME" ) String name, Model model) {
//		model.addAttribute("user", name);
//    System.out.println("WelcomeController.greeting :" + name);
//	return "success";
//	
//	}
	
}

