package com.amit.java8.task;

import java.io.IOException;

public class Child extends Parent{

public void m1() {
	super.parent();
	System.out.println("hi child");
}
public static void main(String[] args){
	Parent pr=new Child();
	Child cd=new Child();
	//pr.m1();
	cd.m1();
	String str="A";
}
}
