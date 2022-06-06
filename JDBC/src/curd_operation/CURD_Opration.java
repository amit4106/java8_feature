package curd_operation;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CURD_Opration {
	private static Connection con = null;
	private static Statement st = null;

	public static void insert() {
		String sql = "insert into student values(1, 'Amit Kumar')";
		String sql2 = "insert into student values(2, 'Amit Kumar')";
		String sql3 = "insert into student values(3, 'Amit Kumar')";
		String sql4 = "insert into student values(4, 'Amit Kumar')";
		String sql5 = "insert into student values(5, 'Amit Kumar')";
		
		
		try {
			con = JDBCUtill.getConnection();
			st=con.createStatement();
//			int value = st.executeUpdate(sql);
			st.addBatch(sql2);
			st.addBatch(sql3);
			st.addBatch(sql4);
			st.addBatch(sql5);
			int[] value = st.executeBatch();
			if(value!=null) {
				System.out.println(value.length+" inserted to the database");
			}
//			else {
//				System.err.println("failed to insert the value");
//			}
		} catch (SQLException e) {
			System.err.println("error occur while executing sql");
			e.printStackTrace();
		}
		finally {
			JDBCUtill.closeResource(con, st);
		}
	}
	
	public static void update() {
		String sql="";
		try {
		con = JDBCUtill.getConnection();
		st = con.createStatement();
		int executeUpdate = st.executeUpdate(sql);
		}catch (SQLException e) {
			System.out.println("");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		insert();
	}
}
