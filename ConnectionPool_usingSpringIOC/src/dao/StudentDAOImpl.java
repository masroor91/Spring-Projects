package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;

import beans.Student;

public class StudentDAOImpl implements StudentDAO {
	
	private BasicDataSource bds;
	
	public void setBds(BasicDataSource bds) {
		this.bds = bds;
	}

	@Override
	public int save(Student s) throws Exception {
		Connection con= bds.getConnection();
		PreparedStatement savestmt = con.prepareStatement("insert into Student Values(?,?,?,?) ");
		savestmt.setInt(1, s.getId());
		savestmt.setString(2, s.getName());
		savestmt.setString(3, s.getEmail());
		savestmt.setString(4, s.getAddress());
		int i=savestmt.executeUpdate(); 
		con.close();
		return i;
	}

	@Override
	public boolean update(Student s) throws Exception {
		Connection con= bds.getConnection();
		boolean status=false;
		PreparedStatement updatestmt = con.prepareStatement("update Student set name=?, email=?,"
				+ " address=? where id = ?");
		updatestmt.setString(1, s.getName());
		updatestmt.setString(2, s.getEmail());
		updatestmt.setString(3, s.getAddress());
		updatestmt.setInt(4, s.getId());
		
		int i=updatestmt.executeUpdate();
		if (i>0){
			status=true;
		}
		con.close();
		return status;
	}

	@Override
	public boolean delete(Student s) throws Exception {
		Connection con= bds.getConnection();
		PreparedStatement deletestmt = con.prepareStatement("Delete from Student where id=?");
		deletestmt.setInt(1, s.getId());
		
		boolean status = deletestmt.execute();
		con.close();
		return status;
	}

	@Override
	public Student findById(int id) throws Exception {
		Connection con= bds.getConnection();
		
		PreparedStatement findByIdstmt = con.prepareStatement("Select * from student where id=?");
		findByIdstmt.setInt(1, id);
		ResultSet rs = findByIdstmt.executeQuery();
		Student s= null;
		if (rs.next()){
			s= new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
		}
		con.close();
		return s;
	}

	@Override
	public List<Student> findByName(String name) throws Exception {
		Connection con= bds.getConnection();
		
		PreparedStatement findByNamestmt = con.prepareStatement("Select * from student where name=?");
		findByNamestmt.setString(1, name);
		ResultSet rs = findByNamestmt.executeQuery();
		List<Student> list= new ArrayList<Student>();
		Student s= null;
		while (rs.next()){
			
			s= new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			list.add(s);
		}
		
		con.close();
		return list;
	}

	@Override
	public List<Student> findByEmail(String email) throws Exception {
		Connection con= bds.getConnection();
		
		PreparedStatement findByEmailstmt = con.prepareStatement("Select * from student where email=?");
		findByEmailstmt.setString(1, email);
		ResultSet rs = findByEmailstmt.executeQuery();
		List<Student> list= new ArrayList<Student>();
		Student s= null;
		while (rs.next()){
			s= new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			list.add(s);
		}
		
		con.close();
		return list;
	}

	@Override
	public List<Student> findByAddress(String address) throws Exception {
		Connection con= bds.getConnection();
		
		PreparedStatement findByAddressstmt = con.prepareStatement("Select * from student where address=?");
		findByAddressstmt.setString(1, address);
		ResultSet rs = findByAddressstmt.executeQuery();
		List<Student> list= new ArrayList<Student>();
		Student s= null;
		while (rs.next()){
			s= new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			list.add(s);
		}
		
		con.close();
		return list;
	}

	@Override
	public List<Student> findByAll() throws Exception {
		Connection con= bds.getConnection();
		PreparedStatement findByAddressstmt = con.prepareStatement("Select * from student");
		ResultSet rs = findByAddressstmt.executeQuery();
		List<Student> list= new ArrayList<Student>();
		Student s= null;
		while (rs.next()){
			s= new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			list.add(s);
		}
		
		con.close();
		return list;
	}

}
