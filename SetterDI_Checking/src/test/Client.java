package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.A;

public class Client {

	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
	
		A a = (A) context.getBean("a");
		
	}

}
