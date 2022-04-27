package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "Patna*123");

		} catch (ClassNotFoundException | SQLException e) {

		}
		return con;
	}

	public static Connection getOracleConnection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "bharti9852613583");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return con;
	}

	/*
	 * public static void closeResource(Connection con, Statement st) { try {
	 * if(con!=null) { con.close(); } if(st!=null) { st.close(); } }catch
	 * (SQLException e) { } }
	 */
}
