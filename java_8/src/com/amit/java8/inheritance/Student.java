package com.amit.java8.inheritance;

public class Student extends Teacher {
	private int age = 10;
	private String name = "sumit";

	public String getName() {
		return "amit";
	}

	public void setName() {

		getName();

	}

	public Student() {
		// this ("amit");
		super("amit");
		System.out.println("default");

	}

	static {

	}

	public Student(String name) {
		this(21, "amit");
		System.out.println(this.name);
		System.out.println("name");

	}

	public Student(int age, String name) {
		super("amit");
		System.out.println(this.age + " " + this.name);
		System.out.println(age + " " + name);
		System.out.println(super.name);

	}

	public static void main(String[] args) {

		Student st = new Student(21, "amit");

	}

}
