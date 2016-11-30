package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDao {
	private Connection con=null;
	
	public int save(String name, String email, String address) throws SQLException{
		con= ConnectionFactory.getConnection();
		
		ResultSet rs = con.createStatement().executeQuery("Select max(id) from Employee");
		int maxid=0;
		if (rs.next()){
			maxid=rs.getInt(1);
			maxid++;
		}
		PreparedStatement insertstm=con.prepareStatement("insert into Employee values(?,?,?,?)");
		insertstm.setInt(1, maxid);
		insertstm.setString(2, name);
		insertstm.setString(3, email);
		insertstm.setString(4, address);
		
		int i=insertstm.executeUpdate();
		return i;
	}
	
	public int update(int id, String name, String email, String address) throws SQLException{
		con= ConnectionFactory.getConnection();
		
		
		PreparedStatement updatestm=con.prepareStatement("update Employee set name=?,"
				+ "email=?, address=? where id=?");
		updatestm.setInt(4, id);
		updatestm.setString(1, name);
		updatestm.setString(2, email);
		updatestm.setString(3, address);
		
		int i=updatestm.executeUpdate();
		return i;
	}
	
	public int isAvailable(int id) throws SQLException{ 
		con= ConnectionFactory.getConnection();
		
		ResultSet rs = con.createStatement().executeQuery("Select * from Employee where id=" + id);
		int available=0;
		
		if (rs.next()){
			available=1;
		}
		
		return available;
	}

}
