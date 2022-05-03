/**
 * Q1.	Sum all the digits of given number. 
 * 		ex : Given  input -12345
 * 		Expected output -15
 */
package QA;

import java.util.Scanner;

public class Q1Solution {
//	Approch 1, Using api
	public static int sum(int num) {
		String value = String.valueOf(num);
		int sum=0;
		for(int i=0; i<value.length();i++) {
			char ch = value.charAt(i);
			String s = String.valueOf(ch);
			int i1 = Integer.valueOf(s);
			sum=sum+i1;
		}
		return sum;
	}
	
//	Approch 2, without using api
/**
 * step 1:	get the reminder of the given number
 * step 2: 	divide the given number by 10
 * step 3:	repeat 1 and 2 till quotient will be equal to 0
 * 			
 * @param num
 * @return
 */
	public static int sum1(int num) {
		int q=num;
		int r=0;
		int sum=0;
		while(q>0) {
			r=q%10;
			q=q/10;
			sum=sum+r;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int value = sc.nextInt();
		int sum = sum1(value);
		System.out.println("sum of 12345 "+sum);
		sc.close();
	}
}
