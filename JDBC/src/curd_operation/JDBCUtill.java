package curd_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtill {
static {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.err.println("error occur while class loading");
		e.printStackTrace();
	}
}
	
	public static Connection getConnection() {
		Connection con=null;
		String userName="root";
		String password="Patna@123";
		String url="jdbc:mysql://localhost:3306/testdb?autoReconnect=true&useSSL=false";
				
		try {
			con=DriverManager.getConnection(url,userName,password);
		} catch (SQLException e) {
			System.err.println("error occur while connection loading");
			e.printStackTrace();
		}
		return con;
	}
	public static void closeResource(Connection con, Statement st){
	try {
		if(con==null)
			con.close();
		if(st!=null)
			st.close();
		}catch (SQLException e) {
			System.err.println("error occur while closing resource");
			e.printStackTrace();
		}
	}
	}

