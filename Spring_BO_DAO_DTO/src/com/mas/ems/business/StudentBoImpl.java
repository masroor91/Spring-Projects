package com.mas.ems.business;

import com.mas.ems.dao.StudentDao;
import com.mas.ems.model.Student;

public class StudentBoImpl implements StudentBo {

	private StudentDao dao;
	
	public void setDao(StudentDao dao) {
		this.dao = dao;
	}
	
	@Override
	public int createStudent(Student s) {
		
		return dao.save(s);
	}

	@Override
	public Student findStudent(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

}
