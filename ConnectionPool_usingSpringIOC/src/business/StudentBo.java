package business;

import java.util.List;

import beans.Student;

public interface StudentBo {

	public int createStudent(Student s) throws Exception;
	public boolean updateStudent(Student s) throws Exception;
	public boolean deleteStudent(Student s) throws Exception;
	public Student getStudentById(int id) throws Exception;
	public List<Student> getStudentByName(String name) throws Exception;
	public List<Student> getStudentByEmail(String email) throws Exception;
	public List<Student> getStudentByAddress(String address) throws Exception;
	public List<Student> getAllStudent() throws Exception;
	
	public String studentToString(Student s);
	public String studentListToString(List<Student> list);
}
