package com.amit.java8.fundamental;

public class Student {
	private String name;
	private int rollNo;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		if(rollNo>30) {
			System.out.println("RollNo should be less then 30 in section A");
			return;
		}
		this.rollNo = rollNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age<0) {
			System.out.println("Age should not be negative");
			return;
		}
		this.age = age;
		
	}

}
