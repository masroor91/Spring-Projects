package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Client {

	public static void main(String [] args){
		
		
		//Core Container will not support the Collection Type Object Bean Creation
		
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		Test t = (Test) context.getBean("t");
		
		System.out.println(t);
		
	}

}
