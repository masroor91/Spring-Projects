package business;

import java.util.List;

import beans.Student;
import dao.StudentDAO;

public class StudentBoImpl implements StudentBo {
	
	private StudentDAO dao;
	
	public void setDao(StudentDAO dao) {
		this.dao = dao;
	}

	@Override
	public int createStudent(Student s) throws Exception {
		
		return dao.save(s);
	}

	@Override
	public boolean updateStudent(Student s) throws Exception {
		return dao.update(s);
	}

	@Override
	public boolean deleteStudent(Student s) throws Exception {
		return dao.delete(s);
	}

	@Override
	public Student getStudentById(int id) throws Exception {
		return dao.findByPk(id);
		
	}

	@Override
	public List<Student> getStudentByName(String name) throws Exception {
		return dao.findByName(name);
	}

	@Override
	public List<Student> getStudentByEmail(String email) throws Exception {
		return dao.findByEmail(email);
	}

	@Override
	public List<Student> getStudentByAddress(String address) throws Exception {
		return dao.findByAddress(address);
	}

	@Override
	public List<Student> getAllStudent() throws Exception {
		return dao.findByAll();
	}
	
	@Override
	public String studentToString(Student s) {
		StringBuilder builder = new StringBuilder("============================Student==============================\n");
		
		builder.append("Student id: ").append(s.getId()).append(" Name: ").append(s.getName())
		.append(" Email: ").append(s.getEmail()).append(" Address: ").append(s.getAddress()).append("\n");
		builder.append("===================================================================");
		
		return builder.toString();
	}

	@Override
	public String studentListToString(List<Student> list) {
		
		
		StringBuilder builder = new StringBuilder("===========================Employee==============================\n");
		
		for (Student s: list){
			builder.append("Student id: ").append(s.getId()).append(" Name: ").append(s.getName())
			.append(" Email: ").append(s.getEmail()).append(" Address: ").append(s.getAddress())
			.append("\n");
			
		}
		builder.append("===================================================================");
		
		return builder.toString();
	}

}
