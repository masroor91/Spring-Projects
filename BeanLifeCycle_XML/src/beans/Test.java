package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {
	
	
	private String driver, url, userName, password;
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

	public void setPassword(String password) {
		this.password = password;
	}

	public void init() throws ClassNotFoundException, SQLException{
		Class.forName(driver);
		con= DriverManager.getConnection(url, userName, password);
		
		System.out.println("Connection to "+ con.getCatalog()+ " is successful");
		
	}
	
	public void save(int id, String name, String email, String address) throws SQLException {
		PreparedStatement insertstmt=con.prepareStatement("insert into Employee values(?,?,?,?)");
		insertstmt.setInt(1, id);
		insertstmt.setString(2, name);
		insertstmt.setString(3, email);
		insertstmt.setString(4, address);
		
		insertstmt.executeUpdate();
		
		System.out.println("Insert statement executed");
	}
	
	public void displayAll() throws SQLException {
		PreparedStatement getAllstmt=con.prepareStatement("Select * from employee");
		ResultSet rs= getAllstmt.executeQuery();
		
		StringBuilder builder = new StringBuilder("Total Employees \n");
		while(rs.next()){
			
			builder.append("Emp id: ").append(rs.getInt(1)).
			append(", Name: ").append(rs.getString(2)).
			append(", Email: ").append(rs.getString(3)).
			append(", Address: ").append(rs.getString(4)).append("\n");
			
		}
		
		System.out.println(builder.toString());
	}
	
	public void delete(int id) throws SQLException {
		PreparedStatement deletestmt=con.prepareStatement("delete from employee where id=?");
		deletestmt.setInt(1, id);
		
		deletestmt.executeUpdate();
		
		System.out.println("Deleted successfully");
	}
	
	public void destroy() throws SQLException {
		con.close();
		System.out.println("Connection closed");
	}

}
