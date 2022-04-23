package com.amit.java8.exception;

public class BankAccount {
	int balance =900;
	public void withdraw(int amount)throws BalanceInsufficientException, InvaildAccountException {
		if(balance - amount<=0 ) {
			throw new BalanceInsufficientException();
		}
	}
	public static void main(String[] args)throws BalanceInsufficientException, InvaildAccountException {
		BankAccount bank=new BankAccount();
		try {
			bank.withdraw(1000);
		}catch (BalanceInsufficientException|InvaildAccountException e) {
			System.out.println(e+" Failed");
		}
	
}
}
