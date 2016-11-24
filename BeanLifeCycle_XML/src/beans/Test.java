package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test {

	private String driver, url, userName, pwd;
	private Connection con;
	
	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void init() throws Exception {
		Class.forName(driver);
		con = DriverManager.getConnection(url, userName, pwd);
		System.out.println("Connection to "+ con.getCatalog() + " Database is successful");
	}

	
	public void save(int id, String name, String mail, String address) throws Exception{
		
		PreparedStatement insertStmt=  con.prepareStatement("Insert into Employee Values(?,?,?,?)");
		insertStmt.setInt(1, id);
		insertStmt.setString(2, name);
		insertStmt.setString(3, mail);
		insertStmt.setString(4, address);
		
		insertStmt.executeUpdate();
		
		System.out.println("Insertion successfull");
		
	}
	
	
	public void destroy() throws Exception {
		con.close();
		System.out.println("Connection closed");
	}
	
	

}
