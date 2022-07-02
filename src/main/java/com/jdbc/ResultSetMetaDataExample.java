package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ResultSetMetaDataExample {
	
	public static void main(String args[]) {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "mukeshh");

			PreparedStatement ps = connection.prepareStatement("select * from emp");
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();

			
			System.out.println("Total columns: " + rsmd.getColumnCount());
			for(int i=1; i<=rsmd.getColumnCount();i++) {
				System.out.println("Column Name of "+i+"st column: " + rsmd.getColumnName(i));
				System.out.println("Column Type Name of "+i+"st column: " + rsmd.getColumnTypeName(i));
			}
			

			connection.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}