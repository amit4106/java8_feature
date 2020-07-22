package com.onlinebook.template;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.onlinebook.constant.Message;
import com.onlinebook.entity.BookEntity;
import com.onlinebook.exception.DataAccessException;
import com.onlinebook.exception.ErrorMessage;
import com.onlinebook.repository.util.JDBCUtil;
import com.onlinebook.response.Response;

public class JdbcTemplate {

	public Response save(BookEntity book) {
		String sql = "insert into books values(?,?,?,?,?,?)";
		try (Connection con = JDBCUtil.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, book.getBookId());
			ps.setString(2, book.getBookName());
			ps.setString(3, book.getAuthorName());
			ps.setString(4, book.getPublication());
			ps.setDouble(5, book.getCost());
			ps.setInt(6, book.getEdition());
			int a = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			ErrorMessage error = new ErrorMessage();
			error.setMessage("error occur while inserting record");
			throw new DataAccessException(error);
		}
		Response res = new Response();
		res.setStatus(Message.SUCCESS);
		return res;
	}

	public Response save(List<BookEntity> books) {
		int[] records = null;
		String sql = "insert into books values(?,?,?,?,?,?)";
		try (Connection con = JDBCUtil.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			for (BookEntity book : books) {
				ps.setString(1, book.getBookId());
				ps.setString(2, book.getBookName());
				ps.setString(3, book.getAuthorName());
				ps.setString(4, book.getPublication());
				ps.setDouble(5, book.getCost());
				ps.setInt(6, book.getEdition());
				ps.addBatch();
			}
			records = ps.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
			ErrorMessage error = new ErrorMessage();
			error.setMessage("error occur while inserting record");
			throw new DataAccessException(error);
		}
		Response res = new Response();
		res.setMessage(String.valueOf(records.length));
		res.setStatus(Message.SUCCESS);
		return res;
	}

	public Response update(BookEntity book) {
		String sql = ("update books set book_name =? where book_id=?");
		try (Connection con = JDBCUtil.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, book.getBookName());
			ps.setString(2, book.getBookId());
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			ErrorMessage error = new ErrorMessage();
			error.setMessage("error occur while updating record");
			throw new DataAccessException(error);
		}
		Response res = new Response();
		res.setMessage("record updated");
		res.setStatus(Message.SUCCESS);
		return res;
	}

	public Response delete(String bookId) {
		String sql = ("delete from books where book_id=? ");
		try (Connection con = JDBCUtil.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, bookId);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			ErrorMessage error = new ErrorMessage();
			error.setMessage("error occur while deleting record");
			throw new DataAccessException(error);
		}
		Response res = new Response();
		res.setMessage("record deleted");
		res.setStatus(Message.SUCCESS);
		return res;
	}

	public BookEntity getBookById(String bookId) {
		BookEntity book = null;
		ResultSet rs = null;
		String sql = ("select * from books where book_id=?");
		try (Connection con = JDBCUtil.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, bookId);
			rs = ps.executeQuery();
			book = new BookEntity();
			if (rs.next()) {
				book.setBookId(rs.getString(1));
				book.setBookName(rs.getString(2));
				book.setAuthorName(rs.getString(3));
				book.setPublication(rs.getString(4));
				book.setCost(rs.getDouble(5));
				book.setEdition(rs.getInt(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			ErrorMessage error = new ErrorMessage();
			error.setMessage("error occur while searching the record");
			throw new DataAccessException(error);
		}
		return book;
	}
	
	public List<BookEntity> getAllBooks(){
		List<BookEntity> listOfBooks=null;
		String sql = "select * from books";
		try(Connection con=JDBCUtil.getConnection(); PreparedStatement ps=con.prepareStatement(sql)){
			ResultSet rs = ps.executeQuery();
			listOfBooks=new ArrayList<>();
			while(rs.next()) {
				BookEntity book=new BookEntity();
				book.setBookId(rs.getString(1));
				book.setBookName(rs.getString(2));
				book.setAuthorName(rs.getString(3));
				book.setPublication(rs.getString(4));
				book.setCost(rs.getDouble(5));
				book.setEdition(rs.getInt(6));
				listOfBooks.add(book);
				
			}
		}catch (SQLException e) {
		}
		return listOfBooks;
	}
	
	public List<BookEntity> getBookByAuthor(String authorName) {
		List<BookEntity> listOfBooks=null;
		String sql = "select * from books where author_name =?";
		try(Connection con=JDBCUtil.getConnection(); PreparedStatement ps=con.prepareStatement(sql)){
			ps.setString(1, authorName);
		ResultSet rs = ps.executeQuery();	
		listOfBooks=new ArrayList<>();
		while(rs.next()) {
			BookEntity book=new BookEntity();
			book.setBookId(rs.getString(1));
			book.setBookName(rs.getString(2));
			book.setAuthorName(rs.getString(3));
			book.setPublication(rs.getString(4));
			book.setCost(rs.getDouble(5));
			book.setEdition(rs.getInt(6));
			listOfBooks.add(book);
		}
		}catch (SQLException e) {
			// TODO: handle exception
		}
		return listOfBooks;
	}
//	public List<BookEntity> getBookByAuthorAndEdition(String author, String edtion){
//		String sql = "select * from books where author_name=? and edtion=?";
//		try(Connection con=JDBCUtil.getConnection(); PreparedStatement ps=con.prepareStatement(sql)){
//			ps.setString(1, author);
//			ps.setInt(2, edition);
//			
//		}catch (SQLException e) {
//			// TODO: handle exception
//		}
//		return null;
//	}
	public List<BookEntity> getBookByAuthorAndPublication(String author, String publication){
		List<BookEntity> listOfBooks=null;
		ResultSet rs=null;
		String sql = "select * from books where author_name =? and publication=?";
		try(Connection con=JDBCUtil.getConnection(); PreparedStatement ps=con.prepareStatement(sql)){
			ps.setString(1, author);
			ps.setNString(2, publication);
			rs = ps.executeQuery();
			listOfBooks=new ArrayList<>();
			while(rs.next()) {
				BookEntity book=new BookEntity();
				book.setBookId(rs.getString(1));
				book.setBookName(rs.getString(2));
				book.setAuthorName(rs.getString(3));
				book.setPublication(rs.getString(4));
				book.setCost(rs.getDouble(5));
				book.setEdition(rs.getInt(6));
				listOfBooks.add(book);
				
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return listOfBooks;
	}
}
