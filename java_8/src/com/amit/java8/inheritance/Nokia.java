package com.amit.java8.inheritance;

public class Nokia implements ServiceProvider{

	@Override
	public void call() {
System.out.println("Calling from Airtel");		
	}

	@Override
	public void sendSms() {
		System.out.println("Sending SMS from Airtel");
		
	}

}
