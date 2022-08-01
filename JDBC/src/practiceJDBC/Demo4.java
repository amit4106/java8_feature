package practiceJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo4 {
public static void main(String[] args) {
	Connection con=null;
	PreparedStatement ps=null;
	String userName="root";
	String password="Patna@123";
	String url="jdbc:mysql://localhost:3306/testdb?autoReconnect=true&useSSL=false";
	String sql="insert into customer values=(?,?)";
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("error occur while class loading");
		e.printStackTrace();
	}
	 
	try {
		con = DriverManager.getConnection(url, userName, password);
		ps = con.prepareStatement(sql);
		ps.setInt(1, 42);
		ps.setNull(2, java.sql.Types.VARCHAR);
		int value = ps.executeUpdate();
		if(value==1) {
			System.out.println("record updated");
		}else {
			System.out.println("record not inserted");
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
		try {
			ps.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	
}
}
