package com.amit.java8.inheritance;

public class Test {

	public static void main(String[] args) {
		ServiceProvider sp = new Nokia();
		sp.call();
		ServiceProvider sp2 = new Motorola();
		System.out.println("");
		sp2.sendSms();
//RedMe rd=new RedMe(); we cannot make object of abstract class
//ServiceProvider sp3=new ServiceProvider(); we cannot create the object of interface

	}

}
