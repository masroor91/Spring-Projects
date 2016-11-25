package test;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Client {

	public static void main(String[] args) throws Exception {
		
		ConfigurableApplicationContext cap= new ClassPathXmlApplicationContext("resources/spring.xml");
		
		while(true){
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1 for save\nEnter 2 For Close\n");
			int key = sc.nextInt();
			
			switch (key) {
			case 1:  Test t = (Test) cap.getBean("t");
					  System.out.println("Enter id\n");
					  int id = sc.nextInt();
					  System.out.println("Enter Name\n");
					  String name = sc.next();
					  System.out.println("Enter mail\n");
					  String mail = sc.next();
					  System.out.println("Enter Address\n");
					  String address = sc.next();
							t.save(id, name, mail, address);
				
				break;

			default: cap.close();
				break;
			}
				
		}
		
	}

}
