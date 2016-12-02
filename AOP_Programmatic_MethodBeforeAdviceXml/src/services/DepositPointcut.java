package services;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

import business.Bank;

public class DepositPointcut extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method m, Class<?> c) {
		String methodName= m.getName();
		
		if(methodName.equals("deposit")){
			return true;
		}
		return false;
	}

}
