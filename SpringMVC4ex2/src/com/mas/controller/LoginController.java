package com.mas.controller;

import java.util.Date;

import javax.validation.Valid;

import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.mas.customeditor.StudentNameEditor;
import com.mas.model.Student;


@Controller  //stereotype to annotate this class as controller
public class LoginController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.setDisallowedFields(new String[]{"mobile"});  //Mobile field of Student is not binded
		
		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy/MM/dd");
		binder.registerCustomEditor(Date.class, "dob", new CustomDateEditor(dateFormat, false));  //Bulitin custom property editor
		
		binder.registerCustomEditor(String.class, "name", new StudentNameEditor());
	}

	
		@RequestMapping(value="/", method= RequestMethod.GET)
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
		
		
		@RequestMapping(value="/login", method=RequestMethod.POST)
		public String handleLoginRequest(@Valid	@ModelAttribute("student") Student student, ModelMap modelMap, BindingResult result) {
			
			if (result.hasErrors()){
				return "login";
			}
			else{
			
			modelMap.put("student", student);
		//	modelMap.put("headerMsg", "Welcome to SDM College of Engineering");
			
			return "welcome";
			}
		}

}
