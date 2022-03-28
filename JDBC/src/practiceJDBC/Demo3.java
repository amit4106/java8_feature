package practiceJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Demo3 {

	public static void main(String[] args) throws Exception{
		Connection con=null;
		Statement st=null;
		String url="jdbc:mysql://localhost:3306/employees";
		String userName="root";
		String pswd="bharti9852613583";
		String sql="insert into student values (2, 'Anu')";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, userName, pswd);
		st = con.createStatement();
		int value = st.executeUpdate(sql);
		if(value==1) {
			System.out.println("value inserted");
		}else {
			System.out.println("not inserted");
		}
		con.close();
		st.close();
	}
}
