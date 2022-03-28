package practiceJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) throws Exception{
		Connection con=null;
		Statement st=null;
		String userName="root";
		String pswd="bharti9852613583";
		String query="insert into employee values(104, 10, 'Preet', 'Rathor', 3000, 'WB')";
		String url="jdbc:mysql://localhost:3306/testdb";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con =DriverManager.getConnection(url, userName, pswd);
		st=con.createStatement();
		int executeUpdate = st.executeUpdate(query);
		if(executeUpdate==1) {
			System.out.println("record inserted");
		}else {
			System.out.println("not inserted");
		}
		con.close();
		st.close();
		
	}
}
