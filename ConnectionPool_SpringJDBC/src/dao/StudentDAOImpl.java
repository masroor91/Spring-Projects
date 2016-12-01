package dao;

import java.sql.Connection;
import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import beans.Student;

public class StudentDAOImpl implements StudentDAO {
	
	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	@Override
	public int save(Student s) throws Exception {
		Connection con= bds.getConnection();
		con.close();
		return 0;
	}

	@Override
	public boolean update(Student s) throws Exception {
		Connection con= bds.getConnection();
		con.close();
		return false;
	}

	@Override
	public boolean delete(Student s) throws Exception {
		Connection con= bds.getConnection();
		con.close();
		return false;
	}

	@Override
	public Student findById(int id) throws Exception {
		Connection con= bds.getConnection();
		con.close();
		return null;
	}

	@Override
	public Student findByName(String name) throws Exception {
		Connection con= bds.getConnection();
		con.close();
		return null;
	}

	@Override
	public Student findByEmail(String email) throws Exception {
		Connection con= bds.getConnection();
		con.close();
		return null;
	}

	@Override
	public Student findByAddress(String address) throws Exception {
		Connection con= bds.getConnection();
		con.close();
		return null;
	}

	@Override
	public List<Student> findByAll() throws Exception {
		Connection con= bds.getConnection();
		con.close();
		return null;
	}

}
