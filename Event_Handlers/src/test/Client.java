package test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ConfigurableApplicationContext cap= new ClassPathXmlApplicationContext("resources/spring.xml");

		cap.start();
		cap.stop();
		cap.close();
		cap.refresh();
	}

}
