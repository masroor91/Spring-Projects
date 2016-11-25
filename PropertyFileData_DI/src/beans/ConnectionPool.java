package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPool {
	
	private String driver, url, userName, password;

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	 public void getConnection() throws ClassNotFoundException, SQLException {
		 
		 Class.forName(driver);
		 
		 Connection con= DriverManager.getConnection(url, userName, password);
		 System.out.println("Connection to "+ con.getCatalog() + " database is successful" );
		
	}
	 

}
