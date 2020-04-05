package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCTemplate {

	private static final String CLOSE_BRACES = ")";
	private static final String OPEN_BRACES = "( ";
	private static final String SINGLE_QUOTE = "'";
	private static final String COMMA = ",";

	public void save(Student stu) {

		// String sql = "insert into student values" +OPEN_BRACES + stu.getSid() + COMMA
		// + SINGLE_QUOTE + stu.getFirstName() + SINGLE_QUOTE + COMMA + SINGLE_QUOTE
		// + stu.getLastName() + SINGLE_QUOTE + COMMA + SINGLE_QUOTE + stu.getState() +
		// SINGLE_QUOTE + CLOSE_BRACES;
		// String sql1=String.format("insert into student values(%d, '%s','%s','%s')",
		// stu.getSid(), stu.getFirstName(), stu.getLastName(),stu.getState());
		// System.out.println(sql1);

		try (Connection con = JDBCUtil.getConnection();
				PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?)")) {
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
		}
	}

	public void delete(int sid) {
		// Connection con = null;
		// PreparedStatement ps = null;
		try (Connection con = JDBCUtil.getConnection();
				PreparedStatement ps = con.prepareStatement("delete from student where sid=?")) {

			ps.setInt(1, sid);

			int x = ps.executeUpdate();
			if (x == 1)
				System.out.println("record deleted");
			else {
				System.out.println("record not deleted");
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}

	}

	public void update(Student stu) {
		// Connection con=null;
		// PreparedStatement ps=null;
		ResultSet rs = null;
		try (Connection con = JDBCUtil.getConnection();
				PreparedStatement ps = con.prepareStatement("update student set sid =? where sid =?")) {
			/*
			 * con = JDBCUtil.getConnection(); String sql = (""); ps =
			 * con.prepareStatement(sql);
			 */
			ps.setInt(1, 999);
			ps.setInt(2, 3);
			int x = ps.executeUpdate();
			if (x == 1)
				System.out.println("record updated");
			else {
				System.out.println("record not updated");
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}

	}

	public Student findById(int id) {
		ResultSet rs = null;
		Student stu = null;
		String sql = ("select * from student where sid =?");
		try (Connection con = JDBCUtil.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

			rs = ps.executeQuery();
			boolean next = rs.next();
			if (next) {
				int sid = rs.getInt(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				String state = rs.getString(4);
				stu = new Student();
				stu.setSid(sid);
				stu.setFirstName(firstName);
				stu.setLastName(lastName);
				stu.setState(state);
			}

		} catch (SQLException e) {
			// TODO: handle exception
		}
		return stu;
	}
	/*
	 * public List<Student> findByState(String state){ String sql =
	 * ("select * from student where state=?"); List<Student> stuList=new
	 * ArrayList<>(); try(Connection con=JDBCUtil.getConnection(); PreparedStatement
	 * ps=con.prepareStatement(sql, ResultSet.TYPE_FORWARD_ONLY)){ ps.setString(1,
	 * state); ResultSet rs = ps.executeQuery(); while(rs.next()) { Student stu=new
	 * Student(); int sid = rs.getInt(1); String firstName = rs.getString(2); String
	 * lastName = rs.getString(3); String state1 = rs.getString(4); stu=new
	 * Student(); stu.setSid(sid); stu.setFirstName(firstName);
	 * stu.setLastName(lastName); stu.setState(state1); stuList.add(stu); }
	 * System.out.println(rs.isFirst()); System.out.println(rs.isLast());
	 * //rs.first(); int i = rs.getInt(1); String str = rs.getString(2);
	 * System.out.println(i+" "+str);
	 * 
	 * 
	 * }catch (SQLException e) { // TODO: handle exception } return stuList; } }
	 */

	public List<Student> findByState(String state) {
		String sql = ("select * from student");
		List<Student> stuList = new ArrayList<>();
		try (Connection con = JDBCUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE);
				Statement st = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);) {
			// ps.setString(1, state);
			ResultSet rs = st.executeQuery(sql);
			// ResultSet rs = ps.executeQuery();

			rs.last();

			/*
			 * while(rs.previous()) { System.out.println(rs.getInt(1)+" "+ rs.getString(2));
			 * }
			 */

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stuList;
	}

	public void findAll() {
		String sql = ("select * from student");
		try (Connection con = JDBCUtil.getOracleConnection();
				PreparedStatement ps = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE);
				Statement st = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);) {
			ResultSet rs = st.executeQuery(sql);
			rs.next();
			rs.last();
			System.out.println("*************************");
			System.out.println(rs.getInt(1) + " " + rs.getString(2));

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void findAll_Scrollable() {
		String sql = ("select * from student");
		try (Connection con = JDBCUtil.getOracleConnection();
				PreparedStatement ps = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE);
				Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY,
						ResultSet.HOLD_CURSORS_OVER_COMMIT);) {
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}
			System.out.println("******************");
			while (rs.previous()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}
			rs.absolute(2);
			System.out.println("-->");
			System.out.println(rs.getInt(1) + " " + rs.getString(2));

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void findAll_Scrollable_Concurrency() {
		String sql = ("select sid, first_name, last_name, state from student");
		try (Connection con = JDBCUtil.getOracleConnection();
				Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);) {
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}
			
			System.out.println("******************");
//			rs.moveToInsertRow();
//			rs.updateInt(1, 5);
//			rs.updateString(2, "Tulsi");
//			rs.updateString(3, "Das");
//			rs.updateString(4, "MP");
			
			//rs.insertRow();
			//rs.absolute(5);
			//System.out.println(rs.getInt(1) + " " + rs.getString(2));
			//rs.absolute(3);
			//rs.deleteRow();
			
			rs.absolute(4);
		
			rs.updateInt(1, 5);
			rs.updateString(2, "Alok");
			rs.updateString(3, "Ranjan");
			rs.updateString(4, "UP");
			rs.updateRow();
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
