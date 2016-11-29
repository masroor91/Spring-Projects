package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static  Connection con;
	private static  String driver;
	private static  String url;
	private static  String user;
	private static  String pwd;

	public static void setDriver(String driver) {
		ConnectionFactory.driver = driver;
	}

	public static void setUrl(String url) {
		ConnectionFactory.url = url;
	}

	public static void setUser(String user) {
		ConnectionFactory.user = user;
	}

	public static void setPwd(String pwd) {
		ConnectionFactory.pwd = pwd;
	}

	public static Connection getConnection() throws SQLException{
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Class could not be found Provide appropriate path for Driver Class");
			e.printStackTrace();
		}
		
		con= DriverManager.getConnection(url, user, pwd);
		
		System.out.println("Connection to " + con.getCatalog() + " is successful");
		
		return con;
	}

}
