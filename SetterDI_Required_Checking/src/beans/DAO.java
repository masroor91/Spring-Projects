package beans;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Required;

public class DAO {

	private String driverclass;
	private String url;
	private String user;
	private String pass;
	
	public DAO() {
		
	}
	
	@Required
	public void setDriverclass(String driverclass) {
		this.driverclass = driverclass;
	}


	@Required
	public void setUrl(String url) {
		this.url = url;
	}


	@Required
	public void setUser(String user) {
		this.user = user;
	}


	@Required
	public void setPass(String pass) {
		this.pass = pass;
	}



	public void displayCon() throws Exception{
		Class.forName(driverclass);
		Connection con= DriverManager.getConnection(url, user, pass);
		System.out.println("Connection to "+ con.getCatalog()+ " is successful");
	}

}
