/**
 * Q1.	Sum all the digits of given number. 
 * 		ex : Given  input -12345
 * 		Expected output -15
 */

package QA;

import java.util.Scanner;

public class Q1 {

	public static void add() {
		int result = 0;
		for (int i = 1; i <= 5; i++) {
			result = result + i;
			System.out.println(result);
		}
	}
	
	public static void dynamicAddition() {
		Scanner sc=new Scanner(System.in);
		int result=0;
		System.out.println("Enter the Number for addition");
		int num=sc.nextInt();
		for (int i = 1; i <= num; i++) {
			result = result + i;
			System.out.println(result);
		}
		
	}

	public static void main(String[] args) {
		
//		add();
		dynamicAddition();
	}
}
