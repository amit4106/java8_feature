package com.amit.java8.test;

public class StarPattern {

	public static void printRightAngleTrangle() {
		int rc = 5;
		int sc = 1;
		for (int i = 0; i < rc; i++) {
			for (int j = 0; j < sc; j++) {
				System.out.print("*");
			}
			System.out.println();
			sc++;
		}
	}

	public static void printReverseAngleTrangle() {
		int rc = 5;
		int bs = 4;
		int sc = 1;
		for (int i = 0; i < rc; i++) {
			for (int j = 0; j < bs; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < sc; k++) {
				System.out.print("*");
			}
			System.out.println();
			bs--;
			sc++;
		}

	}

	public static void printCombindTrangle() {
		int rc = 5;
		int bs = 8;
		int sc = 1;
		for (int i = 0; i < rc; i++) {
			for (int l = 0; l < sc; l++) {
				System.out.print("*");
			}
			for (int j = 0; j < bs; j++) {
				System.out.print(" ");

			}
			for (int k = 0; k < sc; k++) {
				System.out.print("*");

			}
			bs = bs - 2;
			sc++;
			System.out.println();
		}
	}

	public static void main(String args[]) {
		// printRightAngleTrangle();
		// printReverseAngleTrangle();
		 printCombindTrangle();

	}
}
