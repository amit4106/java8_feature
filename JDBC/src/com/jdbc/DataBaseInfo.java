package com.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseInfo {

	public static void main(String[] args) {
		try (Connection con = JDBCUtil.getConnection();) {
			DatabaseMetaData md = con.getMetaData();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from student ");
			
			ResultSetMetaData md1 = rs.getMetaData();
			System.out.println(md1.getColumnCount());
			System.out.println(md1.getColumnName(1));
			System.out.println(md1.getTableName(1));
			
			/*System.out.println(md.getURL());
			System.out.println(md.getUserName());
			System.out.println(md.getDatabaseMajorVersion());
			System.out.println(md.getDatabaseMinorVersion());
			System.out.println(md.getDriverName());*/
			// to be discuss ResultSet DatabaseMetaData.
			
		} catch (SQLException e) {

		}
	}

}
