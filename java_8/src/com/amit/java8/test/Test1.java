package com.amit.java8.test;

import java.util.Scanner;

public class Test1 {

	public void m1() {System.out.println("HELLO");}
	public int m1(int a) {
		this.m1();
		return a;}
	public void m1(int a, int b) {}
	
	
	public static void main(String[] args) {
	Test1 t=new Test1();
	t.m1(10, 20);
	System.out.println(t.m1(20));
	}
	}

