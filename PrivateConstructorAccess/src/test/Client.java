package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import beans.Test;

public class Client {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class c=Class.forName("beans.Test");
		
		Constructor con[] = c.getDeclaredConstructors();
		con[0].setAccessible(true);					//By using reflection classe we can access the private constructors
		Test t = (Test) con[0].newInstance(null); 
		
		//IOC use same implementation as above to create a bean object instance so that it can access the private constructors also
		
		t.hello();

	}

}
