package services;

import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;

import business.Bank;

public class LogInExceptionService implements ThrowsAdvice {

	public void afterThrowing(Exception e) {
		
		Log l = LogFactory.getLog(Bank.class);
		l.info("in case of Exception in Deposit methods : " + e.getMessage());
	}
	
	
	

}
