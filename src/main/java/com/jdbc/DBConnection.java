package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DBConnection {

	private static Connection con = null;

	
	// This method provide Connection object
	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3360/practice";
		String user = "root";
		String password = "mukeshh";
		if (con == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		} // if statement closing
		return con;
	}

}
