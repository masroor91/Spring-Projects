package dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateTemplate;

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
		return true;
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
		dc.add(Restrictions.eq("Name", name));
		
		List<Student> list = (List<Student>) ht.findByCriteria(dc);
		return list;
	
	}

	@Override
	public List<Student> findByEmail(String email) throws Exception {
		
		
		DetachedCriteria dc= DetachedCriteria.forClass(Student.class);
//		dc.setProjection(projection);
		dc.add(Restrictions.eq("Email", email));
		
		List<Student> list = (List<Student>) ht.findByCriteria(dc);
		return list;
	}

	@Override
	public List<Student> findByAddress(String address) throws Exception {
		
		DetachedCriteria dc= DetachedCriteria.forClass(Student.class);
//		dc.setProjection(projection);
		dc.add(Restrictions.eq("Address", address));
		
		List<Student> list = (List<Student>) ht.findByCriteria(dc);
		return list;
		
	}

	@Override
	public List<Student> findByAll() throws Exception {
		
		List<Student> list = (List<Student>) ht.find("from Student");
		return list;
	}

}
