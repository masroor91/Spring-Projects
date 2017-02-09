package com.mas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mas.model.Student;


@Controller  //stereotype to annotate this class as controller
public class LoginController {

	
		@RequestMapping(value="/login", method= RequestMethod.GET)
		public String showLoginPage() {
			return "login";
	
		}
		
//		@RequestMapping(value="/login/login", method=RequestMethod.POST)
//		public String handleLoginRequest(@RequestParam(value="name", defaultValue="Name Not Provided") String name, 
//				@RequestParam(value="hobby", defaultValue="Not Provided") String hobby,ModelMap model) {
//			Student student= new Student();
//			student.setName(name);
//			student.setHobby(hobby);
//			
//			model.put("student", student);
//			model.put("headerMsg", "Welcome to SDM College of Engineering");
//			
//			return "welcome";
//		}
		
		@RequestMapping(value="/login/login", method=RequestMethod.POST)
		public String handleLoginRequest(@ModelAttribute("student") Student student,ModelMap model) {
			
			model.put("student", student);
			model.put("headerMsg", "Welcome to SDM College of Engineering");
			
			return "welcome";
		}

}
