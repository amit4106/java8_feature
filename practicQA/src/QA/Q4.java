/**
 * Q1:	WAP to find the factorial.
 * Q2:	WAP to find the prime number.
 * Q3: 	WAP to find the min and max value of given array -int []arr={20,50,70,10,5,25,90};.
 * 
 */

package QA;

import java.util.Scanner;

public class Q4 {
	public static void factorial() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get the factorial");
		int num = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is = " + fact);
	}

	public static void primeNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find whether it is Prime number or NOT?");
		int num = sc.nextInt();
		boolean b = true;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0)
				b = false;
			break;
		}
		if (b == true) {
			System.out.println(num + " " + "is Prime Number");
		} else {
			System.out.println(num + " " + "is not Prime Number");
		}
	}

	public static void minArrayValue() {
		int[] arr = { 20, 50, 70, 10, 5, 25, 90 };
		int minValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < minValue) {
				minValue = arr[i];
			}
		}
		System.out.println("Minimum value of Array is "+minValue);
	}
	
	public static void maxArrayValue() {
		int[] arr = { 20, 50, 70, 10, 5, 25, 90 };
		int maxVal = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		System.out.println("Maximum value of Array is "+maxVal);
	}

	public static void main(String[] args) {
//		factorial();
//		primeNumber();
//		minArrayValue();
		maxArrayValue();
	}
}
