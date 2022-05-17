package com.jdbc;

import java.sql.*;

public class TestDemo {
	public static void main(String[] args) throws Exception {
		Connection con;
		Statement st;
		String url="jdbc:mysql://localhost:3306/testdb?autoReconnect=true&useSSL=false";
		String uName="root";
		String pswd="Patna@123";
		String sql="select depar_id from employee";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(url, uName, pswd);
		st=con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		String userDate="";
		while(rs.next()) {
//			userDate=rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+
//		rs.getInt(5)+" "+rs.getString(6);
			System.out.println(rs.getInt(1)+" ");
		}
		
		con.close();
		st.close();
	
	}
}
