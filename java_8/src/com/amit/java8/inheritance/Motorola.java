package com.amit.java8.inheritance;

public class Motorola implements ServiceProvider{

	@Override
	public void call() {
		System.out.println("Calling from JIO");
		
	}

	@Override
	public void sendSms() {
		System.out.println("Text from JIO");		
	}

}
