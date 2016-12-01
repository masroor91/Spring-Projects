package dao;

import java.util.List;

import beans.Student;

public interface StudentDAO {
	
	public int save(Student s) throws Exception;
	public boolean update(Student s) throws Exception;
	public boolean delete(Student s) throws Exception;
	public Student findById(int id) throws Exception;
	public Student findByName(String name) throws Exception;
	public Student findByEmail(String email) throws Exception;
	public Student findByAddress(String address) throws Exception;
	public List<Student> findByAll() throws Exception;
}
