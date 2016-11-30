package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import beans.EmpRegBean;

public class EmpRegController extends SimpleFormController {

	public EmpRegController() {
		setCommandClass(EmpRegBean.class);
		setCommandName("empreg");
		setValidator(new FormValidator());
		setFormView("empsave");
	}
	
	
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, 
			Object command, BindException errors) throws Exception {
		
		EmpRegBean empRegBean= (EmpRegBean) command;
		System.out.println(empRegBean.getName());
		System.out.println(empRegBean.getEmail());
		System.out.println(empRegBean.getAddress());
		
		return new ModelAndView("success");
	}

}
