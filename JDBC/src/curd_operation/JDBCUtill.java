package curd_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class JDBCUtill {
	static {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Error occur while class loading");
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		Connection con=null;
		String url="jdbc:mysql://localhost:3306/testbd";
		String userName="root";
		String password="Patna";
				try {
					con = DriverManager.getConnection(url, userName, password);
				} catch (SQLException e) {
					System.out.println("Error occur while connection establishing");
					e.printStackTrace();
				}
		
		return con;
	}
	
	public static void closeResouce(Connection con, PreparedStatement st) {
		
		 
			try {
				if(con!=null)
					con.close();
					if(st!=null)
					st.close();	
			} catch (SQLException e) {
				System.out.println("Error occur while closing resource");
				e.printStackTrace();
			}
		
			
	}
	
}
