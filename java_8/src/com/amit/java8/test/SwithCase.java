package com.amit.java8.test;

public class SwithCase {
	
	public static void main(String[] args) {
	
		PersonDetail pd=new PersonDetail("US", "123", 18, 500);
	if(pd.getNationality().equalsIgnoreCase("Indian")) {
	if(pd.getId().equals("123")) {
		if(pd.getAge()>=18) {
			if(pd.getMinAmount()>=500) {
				System.out.println("your account is open successfully");
			}
			else {
				System.out.println("Balance is low, min bal sud be 500");
			}
		}
		else {
			System.out.println("u are not eligible for a/c opening, min age sud be 18 yrs");
		}
	}
	else {
		System.out.println("u must have id for a/c");
	}
	
	}
//	else {
//		System.out.println("ur citizenship sud be Indian for a/c opening");
//	}
	}

}
