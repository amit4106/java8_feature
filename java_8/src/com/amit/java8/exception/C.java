package com.amit.java8.exception;

public class C  {

public void m1() {
	m2();
}

public void m2() {
	
	m1();
}

public static void main(String[] args) {
	C c=new C();
	c.m1();
}

}
