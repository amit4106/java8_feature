package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/testdb";
			con = DriverManager.getConnection(url, "root", "bharti9852613583");
			String sql = "insert into student values(7,'Pintu','Kumar','Rajsthan')";
			st = con.createStatement();
			int x = st.executeUpdate(sql);
			if(x==0)
				System.out.println("record inserted");
			else {System.out.println("record not inserted");}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)
					con.close();
				if(st!=null)
					st.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}

	}
}
