package test;

import java.util.Calendar;

import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Client {

	public static void main(String[] args) {
	
		
		 ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		 Test t = (Test) ap.getBean("t");
		 Test t1 = (Test) ap.getBean("t");
		 
		 System.out.println(t==t1);
		 
		 Calendar c=(Calendar) ap.getBean("c");
		 Calendar c1 =(Calendar) ap.getBean("c");
		 System.out.println(c.getTime());
		 
		 System.out.println(c==c1);

	}

}
