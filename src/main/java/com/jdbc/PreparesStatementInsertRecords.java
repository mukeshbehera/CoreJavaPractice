package com.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparesStatementInsertRecords {
	
	public static void main(String args[]) throws Exception {
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","mukeshh");

		PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?)");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do {
			System.out.print("enter id:");
			int id = Integer.parseInt(br.readLine());
			System.out.print("enter name:");
			String name = br.readLine();
			System.out.print("enter salary:");
			float salary = Float.parseFloat(br.readLine());

			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setFloat(3, salary);
			int i = ps.executeUpdate();
			System.out.println(i + " records affected");

			System.out.println("Do you want to continue: y/n");
			String s = br.readLine();
			if (s.startsWith("n")) {
				break;
			}
		} while (true);

		con.close();
	}
}
