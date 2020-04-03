package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TryWithResource {
	
	public static void getUser(Student stu) {
		
		String sql = "select * from student where state = ?";
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root",
				"bharti9852613583"); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, stu);

		}

		catch (SQLException e) {
		}
	}
}
