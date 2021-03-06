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
			//modelMap.put("headerMsg", "Welcome to SDM College of Engineering");
			
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
		
		
		 //For Adding Common Objects. Spring MVC will call this method first before making call to any other method first
		@ModelAttribute
		public void addCommonObjects(ModelMap modelMap){
			modelMap.put("headerMsg", "Welcome to SDM College of Engineering"); 
		}
		
		
		@RequestMapping(value="/login/login", method=RequestMethod.POST)
		public String handleLoginRequest(@ModelAttribute("student") Student student,ModelMap modelMap) {
			
			modelMap.put("student", student);
		//	modelMap.put("headerMsg", "Welcome to SDM College of Engineering");
			
			return "welcome";
		}

}
