package com.amit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {

static {
//	Step 1: Load the Driver class.
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
	public static Connection getMySQLConnection() {
//		Step 2: Establish the Connection between the JDBC program and Database.
		final String url = "jdbc:mysql://localhost:3306/testdb";
		Connection con=null;
		try {
			con = DriverManager.getConnection(url, "root", "bharti9852613583");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public static void cleanup(Statement st, Connection con) {
try {
		if (con != null)
			con.close();
		if (st != null)
			st.close();
}
catch (SQLException e) {
	// TODO: handle exception
}
	}


}
