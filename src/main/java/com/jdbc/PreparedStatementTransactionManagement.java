package com.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementTransactionManagement {

	public static void main(String args[]) {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "mukeshh");
			con.setAutoCommit(false);

			PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?)");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while (true) {

				System.out.print("enter id");
				String s1 = br.readLine();
				int id = Integer.parseInt(s1);

				System.out.print("enter name");
				String name = br.readLine();

				System.out.print("enter salary");
				String s3 = br.readLine();
				int salary = Integer.parseInt(s3);

				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setInt(3, salary);
				ps.executeUpdate();

				System.out.print("commit/rollback");
				String answer = br.readLine();
				if (answer.equals("commit")) {
					con.commit();
				}
				if (answer.equals("rollback")) {
					con.rollback();
				}

				System.out.print("Want to add more records y/n");
				String ans = br.readLine();
				if (ans.equals("n")) {
					break;
				}

			}
			con.commit();
			System.out.println("record successfully saved");

			con.close();// before closing connection commit() is called
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}