package com.mas.customeditor;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {

	//when login form is submitted
	//springMVC will run setAsText function of this class
	//before performing data binding task for StudentName property
	
	@Override
	public void setAsText(String name) throws IllegalArgumentException {

		if (!(name.contains("Mr.") || name.contains("Ms."))) {		
			name="Ms. "+ name;
		}
		
		setValue(name);
	
	
	}
	
}
