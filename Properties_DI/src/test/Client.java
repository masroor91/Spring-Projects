package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Client {

	public static void main(String[] args) {
		
		String file="resources/spring-properties.xml"; //for reading the K,V pairs from properties file
		
		//String file ="resources/spring.xml";
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext(file);
		
		Test t = (Test) context.getBean("t");
		
		System.out.println(t);
	}

}
