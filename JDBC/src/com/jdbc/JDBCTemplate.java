package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class JDBCTemplate {

	private static final String CLOSE_BRACES = ")";
	private static final String OPEN_BRACES = "( ";
	private static final String SINGLE_QUOTE = "'";
	private static final String COMMA = ",";

	public void save(Student stu) {

		PreparedStatement ps=null;
		Connection con = JDBCUtil.getConnection();
		//String sql = "insert into student values" +OPEN_BRACES + stu.getSid() + COMMA + SINGLE_QUOTE + stu.getFirstName() + SINGLE_QUOTE + COMMA + SINGLE_QUOTE
			//	+ stu.getLastName() + SINGLE_QUOTE + COMMA + SINGLE_QUOTE + stu.getState() + SINGLE_QUOTE + CLOSE_BRACES;
		//String sql1=String.format("insert into student values(%d, '%s','%s','%s')", stu.getSid(), stu.getFirstName(), stu.getLastName(),stu.getState());
		//System.out.println(sql1);
		
		try {
			//st = con.createStatement();
			ps = con.prepareStatement("insert into student values(?,?,?,?)");
			ps.setInt(1, stu.getSid());
			ps.setString(2, stu.getFirstName());
			ps.setNString(3, stu.getLastName());
			ps.setNString(4, stu.getState());
			int a = ps.executeUpdate();
			if (a == 1) {
				System.out.println("record inserted");

			} else {
				System.out.println("recored not inserted");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.closeResource(con, ps);
		}
	}
	public void delete(int sid) {
		
	}
	public void update(Student stu) {
		
	}
	public List<Student> findAll() {
		
	return null;	
	} 
	public Student findById(int id) {
		return null;
	}
	
}
