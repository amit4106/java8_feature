package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchUpdate {

	public static void main(String[] args) {
		String sql = ("insert into student values (?,?,?,?)");
		try(Connection con=JDBCUtil.getConnection();
				PreparedStatement ps=con.prepareStatement(sql)){
			ps.setInt(1, 10);
			ps.setString(2, "Mahi");
			ps.setString(3, "Kumari");
			ps.setString(4, "UP");
			
			ps.addBatch();
			
			ps.setInt(1, 101);
			ps.setString(2, "Alok");
			ps.setString(3, "Kumar");
			ps.setString(4, "WB");
			
			ps.addBatch();
			
			int[] x = ps.executeBatch();
			System.out.println(x.length);
			
		}catch (SQLException e) {
			// TODO: handle exception
		}
	}
}
/*Q: Create a table-books having column -book_id, book_name, author_name, publication, cost, edtion
 *Q: create a table user_info. having column user_name and paswd
 *Q: A class of book service providing below services 
 *		1. Add_Book(Book b):boolean
 *		2. Verify user(String s, String s1):boolean
 *		3. Delete book(String s):int
 *		4. Update book(book b):int
 *		5. Get bookByAuthor(String authorName):List<Book>
 *		6. Get booksByName(String s):List<Book>
 *		7. Get allBooks():List<Books>
 * 		8. Get booksByCost(Double d):List<Book>
 * 
 * Q:Create a book Class having atrributs book_id, book_name, author_name, publication, cost, edtion
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
