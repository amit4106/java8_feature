package com.jdbc.curd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Statement;

public class Test2 {
	public static void main(String[] args) throws Exception {

		Connection con = null;
		Statement st = null;
		String url = "jdbc:mysql://localhost:3306/testdb1";
		String userID = "root";
		String pswd = "Patna*123";
		String sql = "DELETE FROM allstar WHERE ID=103";

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con.setAutoCommit(false);
		Savepoint sp1 = con.setSavepoint("save1");
		st.executeUpdate(sql);
		Savepoint sp2 = con.setSavepoint("save2");
		
		String sql2 = "DELETE FROM allstar WHERE ID=124";
		st.executeUpdate(sql2);
		con.rollback(sp2);
		con.commit();
		con.close();
		

	}
}
