package com.amit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
//			Step 1: Load the Driver class.
			Class.forName("com.mysql.jdbc.Driver");
//			Step 2: Establish the Connection between the JDBC program and Database.
			final String url = "jdbc:mysql://localhost:3306/testdb";
			con = DriverManager.getConnection(url, "root", "bharti9852613583");
//			Step 3: Prepare the SQL statement.
			String sql = "insert into student Values(102,'Mahendra', 'Kumar', 'Bihar')";
//			Step 4: Create the JDBC statement.
			st = con.createStatement();
//			Step 5: Submit the SQL statement to Database using JDBC statement.
			int count = st.executeUpdate(sql);
//			Step 6: Process the result.
			if (count == 1) {
				System.out.println("record inserted successfully");
			} else {
				System.out.println("recored not inserted");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		Step 7: Close all the resources.
		finally {

			try {
				if (con != null)
					con.close();
				if (st != null)
					st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
