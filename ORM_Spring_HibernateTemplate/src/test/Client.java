package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Student;
import business.StudentBo;

public class Client {

	public static void main(String[] args) throws Exception {
		
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		StudentBo stbo=(StudentBo) cap.getBean("bo");
		
		while (true){
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Select one of the following\n");
			System.out.println("1.Insert new Student\n2. Update a Student\n3. Delete a Student"
					+ "\n4.Find Student by Student Id\n5.Find Student By Name"
					+ "\n6.Find Students By their Email\n7.Find Students By their Address"
					+ "\n8.Display All Student\n9.Exit");
			
			int ch=sc.nextInt();
			int id=0;
			String name=null;
			String email=null;
			String address=null;
			Student s=null;
			List<Student> list=new ArrayList<>();
			switch (ch) {
			case 1:
				System.out.println("Enter the id:");
				id=sc.nextInt();
				System.out.println("Enter the name:");
				name=sc.next();
				System.out.println("Enter the email:");
				email=sc.next();
				System.out.println("Enter the address:");
				address=sc.next();
				int i=stbo.createStudent(new Student(id, name, email, address));
				System.out.println(i + " record inserted into Student Table");
				
				break;
			case 2:
				System.out.println("Enter the Student id of which data needs to be updated:");
				id=sc.nextInt();
				System.out.println("Enter the new name:");
				name=sc.next();
				System.out.println("Enter the new email:");
				email=sc.next();
				System.out.println("Enter the new address:");
				address=sc.next();
				boolean status= stbo.updateStudent(new Student(id, name, email, address));
				if (status){
					System.out.println("Record Updated Successfully");
				}
				else{
					System.out.println("Some sql Exception occurred");
				}
				break;
			case 3:
				System.out.println("Enter the Student id of which data needs to be deleted:");
				id=sc.nextInt();
				s= new Student();
				s.setId(id);
				boolean flag = stbo.deleteStudent(s);
				if (flag){
					System.out.println("Record deleted Successfully");
				}
				else{
					System.out.println("Some sql Exception occurred");
				}
				break;
			case 4:
				System.out.println("Enter the Student id to display its data:");
				id=sc.nextInt();
				s= stbo.getStudentById(id);
				System.out.println(stbo.studentToString(s));
				break;
			case 5:
				System.out.println("Enter the Student name to display its data:");
				name=sc.next();
				list =stbo.getStudentByName(name);
				System.out.println(stbo.studentListToString(list));
				break;
			case 6:
				System.out.println("Enter the Student email to display its data:");
				email=sc.next();
				list = stbo.getStudentByEmail(email);
				System.out.println(stbo.studentListToString(list));
				break;
			case 7:
				System.out.println("Enter the Student address to display its data:");
				address=sc.next();
				list = stbo.getStudentByAddress(address);
				System.out.println(stbo.studentListToString(list));
				break;
			case 8:
				System.out.println("Displaying the info of all Student:");
				list = stbo.getAllStudent();
				System.out.println(stbo.studentListToString(list));
				break;
			case 9:
				cap.close();
				System.exit(0);
				break;

			default:
				cap.close();
				System.exit(0);
				break;
			}
			
		}
		
	}

}
