package com.mas.ems.business;

import com.mas.ems.model.Student;

public interface StudentBo {
	
	public int createStudent(Student s);
	
	public Student findStudent(int id);

}
