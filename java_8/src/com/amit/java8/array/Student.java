package com.amit.java8.array;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class Student {

	private final String name;
	private final int rollNo;
	private final Date dob;
	private final Address address;

	public Student(String name, int rollNo, Date dob, Address address) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.dob = dob;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public Date getDob() {
		return (Date) dob.clone();
	}

	public Address getAddress() {
		return new Address(address.getState(), address.getPinCode());
	}

	@Override
	public String toString() {
		SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");

		String dob1=sf.format(dob);
		return "Student [name=" + name + ", rollNo=" + rollNo + ", dob=" + dob1 + ", address=" + address + "]";
	}

}
