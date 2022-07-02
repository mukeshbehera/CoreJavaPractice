package com.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DatabaseMetaDataExample {

	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "mukeshh");

			DatabaseMetaData dbmd = con.getMetaData();
			String table[] = { "TABLE" };
			ResultSet rs = dbmd.getTables(null, null, null, table);

			while (rs.next()) {
				System.out.println(rs.getString(3));
			}

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
