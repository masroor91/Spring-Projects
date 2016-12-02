package services;

import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import business.Bank;

public class LogAroundService implements org.aopalliance.intercept.MethodInterceptor {


	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		Log l = LogFactory.getLog(Bank.class);
		l.info("Before Deposit code ......");
		
		Object ret= mi.proceed();  //Methods proceeds to execute
		
		l.info("After Deposit Code");
		
		return ret;
		
	}
	
	
	

}
