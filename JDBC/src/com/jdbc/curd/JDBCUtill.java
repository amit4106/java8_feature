package com.jdbc.curd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtill {
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			System.out.println("Occur while loading the class");
			e.printStackTrace();
		}
	}
	
	public final static Connection getSQLConnection() {
		Connection con=null;
		String url="jdbc:mysql://loaclhost:3306/testdb";
		String userId="root";
		String pswd="Patna*123";
		
		try {
			con = DriverManager.getConnection(url, userId, pswd);
		} catch (SQLException e) {
			System.out.println("Occur while establising the connection between JDBC and Database");
			e.printStackTrace();
		}
		return con;
	}
	
	public final static void closeResource(Connection con, Statement st) {
		
		
			try {
				if(con!=null)
				con.close();
				if(st!=null)
				st.close();
			} catch (SQLException e) {
				System.out.println("Occur while closing the resource");
				e.printStackTrace();
			}
	}
}
