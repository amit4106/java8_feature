package com.jdbc;

public class Client1 {

	public static void main(String[] args) {
	Student st=new Student(117, "Alok", "Kumar", "bihar");
	JDBCTemplate temp=new JDBCTemplate();
	temp.save(st);
	
}
}
