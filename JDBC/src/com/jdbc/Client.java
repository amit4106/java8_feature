package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Client {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;

		try {
			con = JDBCUtil.getConnection();
			// String sql = "delete from student where sid=112";
			String sql = "update student set State='MP' where sid=1";
			st = con.createStatement();
			int i = st.executeUpdate(sql);
			if (i == 1) {
				System.out.println("record deleted");
			} else {
				System.out.println("record not found");
			}
		} catch (SQLException e) {
		} finally {
			JDBCUtil.closeResource(con, st);
		}
	}

}
