package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.DAO;

public class Client {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		DAO dao= (DAO) context.getBean("dao");
		
		DAO dao2= (DAO) context.getBean("dao2");
		dao.displayCon();
		dao2.displayCon();
	}

}
