package com.jdbc.ps;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import practiceJDBC.JDBCUtil;

public class InsertRecord {

	public static void main(String[] args) {
		String sql = "insert into college values(5,'NRI','Bhopal','MP')";
		Connection con = null;
		Statement st = null;

		try {
			con = JDBCUtil.getMySQLConnection();
			st = con.createStatement();
			int value = st.executeUpdate(sql);

			if (value == 1) {
				System.out.println("inserted");
			} else {
				System.out.println("Fail to insert");
			}
		} catch (SQLException e) {
			System.out.println("Exception occur while executing query");
			e.printStackTrace();
		}

		finally {
			JDBCUtil.closeResource(con, st);
		}

	}
}
