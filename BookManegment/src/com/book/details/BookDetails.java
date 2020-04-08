package com.book.details;

public class BookDetails {
	private int bookID;
	private String bookName;
	private String authorName;
	private String publication;
	private double cost;
	private String edtion;
	/**
	 * @return the bookID
	 */
	public int getBookID() {
		return bookID;
	}
	/**
	 * @param bookID the bookID to set
	 */
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}
	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	/**
	 * @return the authorName
	 */
	public String getAuthorName() {
		return authorName;
	}
	/**
	 * @param authorName the authorName to set
	 */
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	/**
	 * @return the publication
	 */
	public String getPublication() {
		return publication;
	}
	/**
	 * @param publication the publication to set
	 */
	public void setPublication(String publication) {
		this.publication = publication;
	}
	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
	/**
	 * @return the edtion
	 */
	public String getEdtion() {
		return edtion;
	}
	/**
	 * @param edtion the edtion to set
	 */
	public void setEdtion(String edtion) {
		this.edtion = edtion;
	}
	public BookDetails(int bookID, String bookName, String authorName, String publication, double cost, String edtion) {
		super();
		this.bookID = bookID;
		this.bookName = bookName;
		this.authorName = authorName;
		this.publication = publication;
		this.cost = cost;
		this.edtion = edtion;
	}
	@Override
	public String toString() {
		return "BookDetails [bookID=" + bookID + ", bookName=" + bookName + ", authorName=" + authorName
				+ ", publication=" + publication + ", cost=" + cost + ", edtion=" + edtion + "]";
	}
}
