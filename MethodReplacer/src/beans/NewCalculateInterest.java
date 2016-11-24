package beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewCalculateInterest implements MethodReplacer {

	@Override
	public Object reimplement(Object o, Method m, Object[] param)
			throws Throwable {
		
			System.out.println("NewCalculateInterest class new calculateInterest method implementation");
		return o;
	}

}



//Here also IOC will provide a proxy class when we load the spring.xml as follows
//Class BankProxy extends Bank{
//	@override
//	Public void calculateInterest(){
//		//The new Implementation
//	}
//}

