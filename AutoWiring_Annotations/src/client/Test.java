package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bus;
import beans.Car;

public class Test {

	public static void main(String[] args) {
		
		//String files= "resources/spring-ByType.xml";
		String files[] = new String[1];
		files[0]= "resources/spring.xml";
		//files[1]="resources/spring-constructor.xml";
		//files[1]="resources/spring-bus.xml";
		
		
		//Will initialize the both the bean class as It is an eager container
		ApplicationContext context = new ClassPathXmlApplicationContext(files);
		
		Car car = (Car) context.getBean("car");
		
		Bus bus=(Bus) context.getBean("bus");
		
		System.out.println(car);
		System.out.println(bus);

	}

}
