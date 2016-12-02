package com.mas.ems.dao;

import com.mas.ems.model.Student;

public interface StudentDao {
	
	public int save(Student st);
	public Student findById(int id);

}
