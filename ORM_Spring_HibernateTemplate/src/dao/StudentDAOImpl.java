package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.HibernateTemplate;

import beans.Student;

public class StudentDAOImpl implements StudentDAO {
	
	private HibernateTemplate ht;

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	
	@Override
	public int save(Student s) throws Exception {
		int i = (Integer) ht.save(s);
		return i;
	}

	@Override
	public boolean update(Student s) throws Exception {
		ht.update(s);
		return true;
	}

	@Override
	public boolean delete(Student s) throws Exception {
		ht.delete(s);
		return status;
	}

	@Override
	public Student findByPk(int pk) throws Exception {
		Student s=  (Student) ht.get(Student.class, pk);
		return s;
		
	}

	@Override
	public List<Student> findByName(String name) throws Exception {
		
		DetachedCriteria dc= DetachedCriteria.forClass(Student.class);
//		dc.setProjection(projection);
		dc.add(Restrictions.eqOrIsNull("Name", name));
		
		List<Student> list = ht.findByCriteria(dc);
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
		
		List<Student> list = ht.find("from Student");
		return list;
	}

}
