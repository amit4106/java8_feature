package com.jdbc.curd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) throws Exception {

		Connection con = null;
		PreparedStatement pst = null;
		String url = "jdbc:mysql://localhost:3306/testdb1";
		String userID = "root";
		String pswd = "Patna*123";
		String sql = "SELECT * FROM allstar WHERE ID =178";

		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, userID, pswd);
		pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery(sql);
		while (rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
					+ " " + rs.getString(5));
		}

	}
}
