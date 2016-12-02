package test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.Bank;

public class Client {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		Bank bankProxy = (Bank) cap.getBean("proxy");
		
		int amount= bankProxy.deposit("sbi123", 5000);
		System.out.println("Total amount: " + amount);
		
//		int amount= bankProxy.findBal("sbi123");
//		System.out.println("Total amount: " + amount);
		
		cap.close();
		
	}

}
