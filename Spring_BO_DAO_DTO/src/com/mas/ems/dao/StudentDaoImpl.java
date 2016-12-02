package com.mas.ems.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.mas.ems.model.Student;

public class StudentDaoImpl implements StudentDao {
	
	private HibernateTemplate ht;
	
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	
	

	@Override
	public int save(Student st) {

		int i= (Integer) ht.save(st);
		return i;
	}

	@Override
	public Student findById(int id) {
		
		return (Student) ht.get(Student.class, id);
	}

}
