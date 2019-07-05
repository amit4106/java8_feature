package com.amit.java8.oops;

//import com.amit.java8.inheritance.*;

public class Student {
	
	static int count=0;
	{
		count++;
		System.out.println(count);
	}
	public Student() {
		
		
	}
	public static void main(String [] args) {
		Student st=new Student();
		Student st1=new Student();
		Student st3=new Student();
		//Teacher t=new Teacher ();
		com.amit.java8.inheritance.Animal an=new com.amit.java8.inheritance.Animal();
		Animal an1=new Animal();
		an.m1();
		an1.m1();
		
	}

}
// to count the number of object in program