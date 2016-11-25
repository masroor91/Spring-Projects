package test;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;
import beans.Test1;
import beans.Test2;

public class Client {
	
	public static void main(String[] args) throws SQLException {
		
		//String file="resources/spring.xml";
		String file="resources/spring-default-lifecycle.xml";
		
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext(file);
		
		Test t= (Test)	cap.getBean("t");
		
		Test1 t1 = (Test1) cap.getBean("t1");
		Test2 t2 = (Test2) cap.getBean("t2");
		
		Scanner sc= new Scanner(System.in);
		
		while(true){
			System.out.println("Enter the choice\n1. Insert a new Record"
					+ "\n2. Delete a Record\n3. Display All Employee\n4. Exit");
			int ch= sc.nextInt();
			
			switch (ch) {
			case 1:
				System.out.println("Enter id");
				int id=sc.nextInt();
				System.out.println("Enter Name");
				String name=sc.next();
				System.out.println("Enter eamil id");
				String email=sc.next();
				System.out.println("Enter Address");
				String address=sc.next();
				t.save(id, name, email, address);
				break;
			
			case 2:
				System.out.println("Enter id");
				int id1=sc.nextInt();
				t.delete(id1);
				break;
				
			case 3:
				t.displayAll();
				break;
			default:
				cap.close();
				break;
			}
			
		}
	
		
	}
}
