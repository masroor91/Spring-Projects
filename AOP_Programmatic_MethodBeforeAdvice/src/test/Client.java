package test;

import org.springframework.aop.framework.ProxyFactoryBean;

import business.Bank;
import services.LogBeforeService;

public class Client {
	
	public static void main(String[] args) {
		
		//create a target
		Bank b= new Bank();
		
		//Create a Advice
		LogBeforeService lbs = new LogBeforeService();
		
		//Add target and advice to proxy
		ProxyFactoryBean pfb = new ProxyFactoryBean();
		pfb.setTarget(b);
		pfb.addAdvice(lbs);
		//pfb.setInterceptorNames(new String[]{"lbs"}); //should be used in XML config
		
		//get Generated proxy Object
		
		Bank bankProxy= (Bank) pfb.getObject();
		
		int amount= bankProxy.deposit("sbi123", 5000);
		
		System.out.println("Total amount: " + amount);
	}

}
