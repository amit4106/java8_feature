package com.jdbc.batch;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import practiceJDBC.JDBCUtil;

public class BatchUpdate {
public static void main(String[] args) {

	String sql = "insert into college values(5,'NRI','Bhopal','MP')";
	String sql2 = "insert into college values(5,'NRI','Bhopal','MP')";
	String sql3 = "insert into college values(5,'NRI','Bhopal','MP')";
	String sql4 = "insert into college values(5,'NRI','Bhopal','MP')";
	String sql5 = "insert into college values(5,'NRI','Bhopal','MP')";
	String sql6 = "insert into college values(5,'NRI','Bhopal','MP')";
	String sql7 = "insert into college values(5,'NRI','Bhopal','MP')";
	Connection con = null;
	Statement st = null;

	try {
		con = JDBCUtil.getMySQLConnection();
		st = con.createStatement();
		st.addBatch(sql);
		st.addBatch(sql2);
		st.addBatch(sql3);
		st.addBatch(sql4);
		st.addBatch(sql5);
		st.addBatch(sql6);
		st.addBatch(sql7);
		int[] count = st.executeBatch();
		if(count!=null) {
			System.out.println(count.length);
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
