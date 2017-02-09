package com.mas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller  //stereotype to annotate this class as controller
public class LoginController {

	
		@RequestMapping(value="/login", method= RequestMethod.GET)
		public String showLoginPage() {
			return "login";
	
		}
		
		@RequestMapping(value="/login/login", method=RequestMethod.POST)
		public String handleLoginRequest(@RequestParam(value="name", defaultValue="Name Not Provided") String name, ModelMap model) {
			model.put("name", name);
			System.out.println(name);
			return "welcome";
		}

}
