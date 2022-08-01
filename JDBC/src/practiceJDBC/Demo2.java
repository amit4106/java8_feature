package practiceJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo2 {
	public static void main(String[] args) throws Exception {
		Connection con=null;
		Statement st=null;
		String url=("jdbc:mysql://localhost:3306/testdb");
		String userName="root";
		String pswd="Patna@123";
		String sql="insert into employee values(106, 11, 'Riku', 'Rajput', 3500, 'MP')";
		
		Class.forName("com.mysql.jdbc.Driver");
		con =DriverManager.getConnection(url, userName, pswd);
		st=con.createStatement();
		int value = st.executeUpdate(sql);
		if(value==1) {
			System.out.println("inserted");
		}else {
			System.out.println("Fail to insert");
		}
		con.close();
		st.close();
		
	}
}
