package services;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import business.Bank;

public class LogAfterService implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object ret, Method m, Object[] param, Object o) throws Throwable {
		
		//Here Object o in parameter is the Business class object ie Bank in our case
		//Method m in parameter is method name in our business class
		//Object[] param are the parameters of our methods in business class in our case
		//Its only one that is deposit and it Parameters are ac and  amt
		//With these parameters present we can do introspection like if we want to check
		//account no is valid or not amount is +ve or not
		//Object ret will pass the return value of Method 
		
		Log l = LogFactory.getLog(Bank.class);
		l.info("Deposit method......" + ret);
		
//		System.out.println(o.getClass().getName());
//		System.out.println(m.getName());
//		
//		for (int i = 0; i < param.length; i++) {
//			System.out.println(param);
//		}
//		
//		System.out.println(ret);
		
	}

	
}
