package com.ioc;

public class B {
private int age;
private String mgs;
public B(int age, String mgs) {
	super();
	this.age = age;
	this.mgs = mgs;
}

public void showB() {
	System.out.println("showB"+ age);
	System.out.println("showB"+ mgs);
}
}
