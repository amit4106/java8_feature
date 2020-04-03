package com.jdbc;

import java.util.Scanner;

public class Client1 {

	public static void main(String[] args) {
	/*Scanner sc=new Scanner(System.in);
	System.out.println("Please enter sid firstName lastName state");
	int sid = sc.nextInt();
	String firstName = sc.next();
	String lastName = sc.next();
	String state = sc.next();
	System.out.println(sid+" "+firstName+" "+lastName+" "+state);
	
		Student st=new Student(sid, firstName, lastName,state);*/
	JDBCTemplate temp=new JDBCTemplate();
	//temp.save(st);
	//temp.delete(4);
	//temp.findById(2);
	Student stu=new Student();
	stu.setSid(3);
	temp.update(stu);
	}
}
