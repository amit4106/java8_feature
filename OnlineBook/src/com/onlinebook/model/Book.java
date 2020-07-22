package com.onlinebook.model;

	public class Book {
		private String bookId;
		private String bookName;
		private String authorName;
		private String publication;
		private double cost;
		private int edition;

		public Book() {
			super();
		}

		public String getBookId() {
			return bookId;
		}

		public void setBookId(String bookId) {
			this.bookId = bookId;
		}

		public String getBookName() {
			return bookName;
		}

		public void setBookName(String bookName) {
			this.bookName = bookName;
		}

		public String getAuthorName() {
			return authorName;
		}

		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}

		public String getPublication() {
			return publication;
		}

		public void setPublication(String publication) {
			this.publication = publication;
		}

		public double getCost() {
			return cost;
		}

		public void setCost(double cost) {
			this.cost = cost;
		}

		public int getEdition() {
			return edition;
		}

		public void setEdition(int edition) {
			this.edition = edition;
		}

		public Book(String bookId, String bookName, String authorName, String publication, double cost, int edition) {
			super();
			this.bookId = bookId;
			this.bookName = bookName;
			this.authorName = authorName;
			this.publication = publication;
			this.cost = cost;
			this.edition = edition;
		}



		@Override
		public String toString() {
			return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", publication="
					+ publication + ", cost=" + cost + ", edition=" + edition + "]";
		}

	}

