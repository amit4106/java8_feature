package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")
public class Student {

	private int sid;
	private String name;
	@Autowired
	private Laptop laptop;
	public Student() {
//		super();
//		this.sid = sid;
//		this.name = name;
		System.out.println("object created");
	}
	public int getSid() {
		return sid;
	}
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Laptop getLaptop() {
		return laptop;
	}
	
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public void m1() {
		System.out.println("m1 of Student");
		laptop.complie();
	}
}
