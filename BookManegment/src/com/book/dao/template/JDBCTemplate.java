package com.book.dao.template;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.book.dao.util.JDBCUtil;
import com.book.model.Book;

public class JDBCTemplate {
	
	public int save(Book book) {
	
		int recordCount=0;
		String sql = ("insert into books values(?,?,?,?,?,?)");
		try(Connection con=JDBCUtil.getConnection();
				PreparedStatement ps=con.prepareStatement(sql)){
			ps.setInt(1, book.getBookID());
			ps.setString(2, book.getBookName());
			ps.setString(3, book.getAuthorName());
			ps.setString(4, book.getAuthorName());
			ps.setDouble(5, book.getCost());
			ps.setString(6, book.getEdtion());
			recordCount = ps.executeUpdate();
		}catch (SQLException e) {
			// TODO: handle exception
		}
		return recordCount;
		
	}
		
}
