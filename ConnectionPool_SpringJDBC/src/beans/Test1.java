package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

public class Test1 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		
		System.out.println("JDBC connection from database");
		Date d1= new Date();
		
		for (int i = 0; i < 25000; i++){
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost/Mas";
				String user="root";
				String pwd="root";
				Connection con = DriverManager.getConnection(url, user, pwd);
				System.out.println(con+ " : " + (i+1));
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}
		
		Date d2= new Date();
		
		System.out.println("\nStart time: "+ d1);
		System.out.println("Start time: "+ d2);
		System.out.println("Time difference: "+ (d2.getSeconds()-d1.getSeconds()));
	}

}
