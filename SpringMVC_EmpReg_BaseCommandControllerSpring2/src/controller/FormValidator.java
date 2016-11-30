package controller;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import beans.EmpRegBean;

public class FormValidator implements Validator {

	@Override
	public boolean supports(Class arg0) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void validate(Object form, Errors error) {
		EmpRegBean empRegBean= (EmpRegBean) form;
		
		if (empRegBean.getName().equals("")){
			error.reject("name", "name is required");
		}
		
		if (empRegBean.getEmail().equals("")){
			error.reject("name", "email is required");
		}
		
		if (empRegBean.getAddress().equals("")){
			error.reject("name", "address is required");
		}


	}

}
