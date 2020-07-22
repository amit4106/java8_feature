package com.jdbc;

import java.util.List;
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
	
	/*Student stu=new Student();
	stu.setSid(4);
	temp.update(stu);*/
	
	//List<Student> students = temp.findByState("WB");
	//students.forEach(System.out::println);
	//temp.findAll();
	//temp.findAll_Scrollable();
	//temp.findAll_Scrollable_Concurrency();
	
	}
}
