package beans;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import org.apache.commons.dbcp2.BasicDataSource;

import com.mysql.fabric.xmlrpc.base.Data;

public class Test {

	public static void main(String[] args) {
		
		BasicDataSource bds= new BasicDataSource();
		
		bds.setDriverClassName("com.mysql.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost/Mas");
		bds.setUsername("root");
		bds.setPassword("root");
		bds.setMaxTotal(20);
		bds.setMaxIdle(5);
		bds.setMaxWaitMillis(1000*5);
		
		Date d1= new Date();
		
		for (int i = 0; i < 25000; i++) {
			try {
				Connection con = bds.getConnection();
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
