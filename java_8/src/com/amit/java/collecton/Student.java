package com.amit.java.collecton;

public class Student {

	private String name;
	private String status;
	private int rollNo;
	
	
	public Student(String name, String status, int rollNo) {
		super();
		this.name = name;
		this.status = status;
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", status=" + status + ", rollNo=" + rollNo + "]";
	}
		
}
