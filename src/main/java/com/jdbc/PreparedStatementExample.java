package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementExample {

	public static void main(String[] args) throws SQLException{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","mukeshh");

			PreparedStatement stmt=connection.prepareStatement("insert into emp values(?,?,?)");  
			stmt.setInt(1,103);//1 specifies the first parameter in the query  
			stmt.setString(2,"Luthu"); 
			stmt.setInt(3, 60000);
			  
			int i=stmt.executeUpdate();  
			System.out.println(i+" records inserted");  
			  
			connection.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
