package com.book.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.book.dao.constant.DBInfo;

public class JDBCUtil {

	

	public static Connection getConnection() {
		Connection con = null;
		ResourceBundle rb=ResourceBundle.getBundle(DBInfo.DB_INFO);
		try {
			Class.forName(rb.getString(DBInfo.DRIVER));
			con = DriverManager.getConnection(rb.getString(DBInfo.URL), rb.getString(DBInfo.USERNAME), rb.getString(DBInfo.PASSWORD));
		} catch (ClassNotFoundException | SQLException e) {
		}
		return con;
		
			}
}
