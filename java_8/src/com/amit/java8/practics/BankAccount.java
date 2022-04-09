package com.amit.java8.practics;

public class BankAccount {
	int balance = 900;

	void withdrawl(int amount)throws BalanceInsuficentException1, InvalidAccountExeption {
		if(balance - amount <=0) {
			throw new BalanceInsuficentException1();
		}
	}

	public static void main(String[] args) throws BalanceInsuficentException1, InvalidAccountExeption {
		BankAccount b = new BankAccount();

		try {
			b.withdrawl(900);
			System.out.println("withdrawl successful");
		} catch (Exception  e) {
			System.out.println("Faild");
			throw e;
		}
	}
}
