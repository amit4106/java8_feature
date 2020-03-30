package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
Connection con=null;
Statement st=null;
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "bharti9852613583");
	String sql = ("delete from student where sid=6");
	st = con.createStatement();
	int x = st.executeUpdate(sql);
	if(x==1)
		System.out.println("record deleted");
	else {System.out.println("record not deleted");}
}catch (ClassNotFoundException|SQLException e) {
	// TODO: handle exception
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
