package com.amit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelect {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			con = JDBCUtil.getMySQLConnection();
//			Step 3: Prepare the SQL statement.
			String sql = "select * from student";
//			Step 4: Create the JDBC statement.
			st = con.createStatement();
//			Step 5: Submit the SQL statement to Database using JDBC statement.
			ResultSet rs = st.executeQuery(sql);
//			Step 6: Process the result.
			while(rs.next()) {
			int sid = rs.getInt(1);
			String firstName = rs.getString(2);
			String lastName = rs.getString(3);
			String state = rs.getString(4);
			
			System.out.println(sid+" "+firstName+" "+lastName+" "+state);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		Step 7: Close all the resources.
		finally {
				JDBCUtil.cleanup(st, con);		
		}

	}


	

}
