package com.mas.ems.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mas.ems.business.StudentBo;
import com.mas.ems.model.Student;

public class EmpSaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ConfigurableApplicationContext cap;
	
	@Override
	public void init() throws ServletException {
		cap= new ClassPathXmlApplicationContext("resources/spring.xml");
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id= Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email= req.getParameter("email");
		String address= req.getParameter("address");
		//Send data to the business
		StudentBo bo= (StudentBo) cap.getBean("bo");
		Student s= new Student(id, name, email, address);
		
		int i= bo.createStudent(s);
		if (i>0){
			
			resp.getWriter().println("success");
		}
		else{
			resp.getWriter().println("fail");
		}
		
		super.doGet(req, resp);
	}
	
	
	@Override
	public void destroy() {
		cap.close();
		super.destroy();
	}
	
	

}
