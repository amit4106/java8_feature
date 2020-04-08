package com.services;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.book.details.BookDetails;
import com.book.jdbc.dao.BookDao;

public class BookServices {

	public boolean addBook(boolean b) {
		String sql = ("insert into books values(?,?,?,?,?,?)");
		try(Connection con=BookDao.getConnection();
				PreparedStatement ps=con.prepareStatement(sql)){
			ps.setInt(1, 2575);
			ps.setString(2, "War and Peace");
			ps.setString(3, "Leo");
			ps.setString(4, "Penguin Books Ltd");
			ps.setDouble(5, 265.3);
			ps.setString(6, "Vol -02");
			int x = ps.executeUpdate();
			if(x==1)
				System.out.println("value inserted");
			else{System.out.println("value not inserted");}
		}catch (SQLException e) {
			// TODO: handle exception
		}
		return true;
	}

	public boolean verifyUser(String userName, String password) {

		return false;
	}

	public int deleteBook(String s) {

		return 0;
	}

	public int updateBook(int i) {
		return 0;
	}

	public List<BookDetails> bookByAuthor(String authorName) {
		return null;
	}

	public List<BookDetails> bookByName(String s) {
		return null;
	}

	public List<BookDetails> allBooks() {
		return null;
	}

	public List<BookDetails> bookByCost(Double d) {
		return null;
	}
}
