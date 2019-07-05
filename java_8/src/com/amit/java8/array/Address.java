package com.amit.java8.array;

public final class Address {

	private String state;
	
	private int pinCode;

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Address(String state, int pinCode) {
		this.state = state;
		this.pinCode=pinCode;
		
	}

	public String getState() {
		return state;
	}

	@Override
	public String toString() {
		return state+ " "+ pinCode;
	}

}
