package com.amit.java8.fundamental;

public final class BankDetail {
	final int cb=40;
	public final static int getAccountNo (){
		return 536;
		
	}
	public static void deposit (int accountNo, int amount) {
		if (accountNo==536) {
			System.out.println(amount);
			
		}
		else {
			System.out.println("invalid accountNo");
		}
	}
	

}
