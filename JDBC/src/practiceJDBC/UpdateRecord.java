package practiceJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {

	public static void main(String[] args) {

		Connection con = null;
		Statement st = null;
		String sql = "update college set id=1000 where id=2";

		try {
			con = JDBCUtil.getMySQLConnection();
			st = con.createStatement();
			int value = st.executeUpdate(sql);

			if (value == 1) {
				System.out.println("record has updated");
			} else {
				System.out.println("Fail to update");
			}
		} catch (SQLException e) {
			System.out.println("Exception occur while updating the data");
			e.printStackTrace();
		}

		finally {

			JDBCUtil.closeResource(con, st);

		}
	}
}
