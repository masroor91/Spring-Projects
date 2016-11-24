package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bus;
import beans.Car;
import beans.Engine;
import beans.Truck;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		System.out.println("================Car================");
		Car c= (Car) ap.getBean("c");
		System.out.println(c.getClass().getCanonicalName());
		
		Engine e= c.myEngine();
		System.out.println(e.getName());
		
		System.out.println("================Bus================");
		Bus b= (Bus) ap.getBean("b");
		System.out.println(b.getClass().getCanonicalName());
			e= b.myBusEngine();
			System.out.println(e.getName());
			
		
		System.out.println("================Truck================");
		Truck t = (Truck) ap.getBean("t");
		System.out.println(t.getClass().getCanonicalName());
			e= t.myTruckEngine();
			System.out.println(e.getName());
		
	}

}
