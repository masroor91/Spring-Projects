package client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

public class Client {

	public static void main(String[] args) {

		Resource r = new ClassPathResource("resources/spring.xml"); 
		//Lazy container will create the object on demand ie only when the resource path is send to it 
		BeanFactory context = new XmlBeanFactory(r);  //deprecated interface
		
		//Eager Container will create the Class object when application is loaded and create all objects here only
		//ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");  
		
		Test o= (Test) context.getBean("t"); //object created here at this point in case of BeanFactory
		Test o1= (Test) context.getBean("t");
		Test o2= (Test) context.getBean("t");
		Test o3= (Test) context.getBean("t");
		
		o.hello();
		
		System.out.println(o==o1);
		System.out.println(o1==o2);
		System.out.println(o2==o3);
	}

}
