package com.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConnection2 {

	static String url = "jdbc:mysql://localhost:3306/db1";
	static String user = "root";
	static String pass = "mukeshh";
	
	 public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url,user,pass);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from udetails");
			
			//int result = statement.executeUpdate("insert into udetails values(102, 'Muntesh', 'Padampur')");
			//int result = statement.executeUpdate("update udetails set name='Vimal',salary=10000 where id=33");  
			//int result = statement.executeUpdate("delete from udetails where id=33");  

			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
			}
			
			connection.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
