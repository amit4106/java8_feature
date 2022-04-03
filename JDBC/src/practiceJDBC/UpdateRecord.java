package practiceJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		String url=("jdbc:mysql://localhost:3306/testdb");
		String userName="root";
		String pswd="bharti9852613583";
		String sql="update college set id=999 where id=3";
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con =DriverManager.getConnection(url, userName, pswd);
		st=con.createStatement();
		int value = st.executeUpdate(sql);
		
		if(value==1) {
			System.out.println("record has updated");
		}else {
			System.out.println("Fail to update");
		}
		}
		catch (ClassNotFoundException e) {
			System.out.println("Exception occur while loding the driver");
			e.printStackTrace();
		}catch (SQLException e) {
			System.out.println("Exception occur while executing the query");
			e.printStackTrace();
		}
		finally {
			try {
				if(con!=null)
				con.close();
				if(st!=null)
				st.close();	
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
