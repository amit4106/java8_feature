package QA;

import java.util.Scanner;
/**
 * Java program to reverse a number
 * @author dell
 *
 */
public class Q10 {
	public static void reverse() {
		int reverse=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to reverse :");
		int i = sc.nextInt();
		while(i!=0) {
			reverse=reverse*10 + i%10;
			i=i/10;
		}
		System.out.println("Number after reverse :"+ reverse);
	}
	public static void main(String[] args) {
		reverse();
	}
}
