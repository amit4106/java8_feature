package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class JDBCTemplate {

	private static final String CLOSE_BRACES = ")";
	private static final String OPEN_BRACES = "( ";
	private static final String SINGLE_QUOTE = "'";
	private static final String COMMA = ",";

	PreparedStatement ps = null;
	Connection con = JDBCUtil.getConnection();
	Statement st = null;

	public void save(Student stu) {

		// String sql = "insert into student values" +OPEN_BRACES + stu.getSid() + COMMA
		// + SINGLE_QUOTE + stu.getFirstName() + SINGLE_QUOTE + COMMA + SINGLE_QUOTE
		// + stu.getLastName() + SINGLE_QUOTE + COMMA + SINGLE_QUOTE + stu.getState() +
		// SINGLE_QUOTE + CLOSE_BRACES;
		// String sql1=String.format("insert into student values(%d, '%s','%s','%s')",
		// stu.getSid(), stu.getFirstName(), stu.getLastName(),stu.getState());
		// System.out.println(sql1);

		try {
			st = con.createStatement();
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
		} finally {
			JDBCUtil.closeResource(con, ps);
		}
	}

	public void delete(int sid) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = JDBCUtil.getConnection();
			String sql = ("delete from student where sid=?");
			ps=con.prepareStatement(sql);
			ps.setInt(1,sid);
			
			int x = ps.executeUpdate();
			if (x == 1)
				System.out.println("record deleted");
			else {
				System.out.println("record not deleted");
			}
		} catch (SQLException e) {
			// TODO: handle exception
		} finally {
			JDBCUtil.closeResource(con, ps);
		}

	}

	public void update(Student stu) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			con = JDBCUtil.getConnection();
			String sql = ("update student set sid ='?' where sid is'?'");
			ps = con.prepareStatement(sql);
			int sid = stu.getSid();
			ps = con.prepareStatement(sql);
			int x = ps.executeUpdate();
			if(x==1)
				System.out.println("record updated");
			else {System.out.println("record not updated");}
		}catch (SQLException e) {
			// TODO: handle exception
		}finally {
			JDBCUtil.closeResource(con, ps);
		}

	}

	public List<Student> findAll() {

		return null;
	}

	public Student findById(int id) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			con = JDBCUtil.getConnection();
			String sql = ("select * from student where sid ='?'");
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs==null)
				System.out.println("recored fetched");
			else {System.out.println("record not fetched");}
			
		}catch (SQLException e) {
			// TODO: handle exception
		}finally {
			JDBCUtil.closeResource(con, ps);
		}
		return null;
	}

}
