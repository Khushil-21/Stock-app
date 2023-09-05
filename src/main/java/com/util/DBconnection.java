package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	public static Connection getConnection() {
		try {

			String driverName = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/stockapp";
			String userName = "root";
			String password = "root";

			Class.forName(driverName);
			Connection con = DriverManager.getConnection(url, userName, password);

			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}
}
