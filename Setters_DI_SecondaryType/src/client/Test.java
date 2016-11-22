package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Test {

	public static void main(String[] args) {
		
		//String[] files = new String[]{"resources/car.xml", "resources/engine.xml"};
		
		//String files="resources/car-engine.xml";
		String files= "resources/car-engine-creating-instance.xml";
		
		//Will initialize the both the bean class as It is an eager container
		ApplicationContext context = new ClassPathXmlApplicationContext(files);
		
		Car car = (Car) context.getBean("car");
		
		System.out.println(car);

	}

}
