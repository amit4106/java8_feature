package com.ioc;

public class A {
private int a;
private String name;

public void setA(int a) {
	this.a = a;
}

public void setName(String name) {
	this.name = name;
}
public void showA() {
	System.out.println("showA "+ a);
	System.out.println("showA "+name);
}
}
