package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Test {

	public static void main(String[] args) {
		
		
		String files= "resources/car-engine.xml";
		
		//Will initialize the both the bean class as It is an eager container
		ApplicationContext context = new ClassPathXmlApplicationContext(files);
		
		Car car = (Car) context.getBean("car");
		
		System.out.println(car);

	}

}
