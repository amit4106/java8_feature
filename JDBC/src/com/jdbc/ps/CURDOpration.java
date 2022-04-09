package com.jdbc.ps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import practiceJDBC.JDBCUtil;

public class CURDOpration {
	public void insert(College college) {
//		String sql1 = "insert into college values("+"5,'NRI','Bhopal','MP')";
		String sql = "insert into college values(?,?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = JDBCUtil.getMySQLConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, college.getId());
			ps.setString(2, college.getCollegeName());
			ps.setString(3, college.getCity());
			ps.setString(4, college.getState());
			int value = ps.executeUpdate();

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
			JDBCUtil.closeResource(con, ps);
		}

	}

	public void deleteById(int id) {
		String sql = "delete from college where id =?";
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = JDBCUtil.getMySQLConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			int value = ps.executeUpdate();

			if (value == 1) {
				System.out.println("deleted");
			} else {
				System.out.println("Fail to deleted");
			}
		} catch (SQLException e) {
			System.out.println("Exception occur while executing query");
			e.printStackTrace();
		}

		finally {
			JDBCUtil.closeResource(con, ps);
		}

	}

	public College[] fetchAll() {
		String sql = "select * from college";
		Connection con = null;
		Statement st = null;
		College[] colleges = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);// executeQuery is specilly used for Select opration

			// create a List
//			List<College> list=new ArrayList<>();
			colleges = new College[3];
			// Iterate record from ResultSet
			int i = 0;
			while (rs.next()) {
				College college = new College();
				college.setId(rs.getInt(1));
				college.setCollegeName(rs.getString(2));
				college.setCity(rs.getString(3));
				college.setState(rs.getString(4));
				colleges[i++] = college;
			}

		} catch (SQLException e) {
			System.out.println("Exception occur while executing query");
			e.printStackTrace();
		}

		finally {
			JDBCUtil.closeResource(con, st);
		}
		return colleges;

	}

}
