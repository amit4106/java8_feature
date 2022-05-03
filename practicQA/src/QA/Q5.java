/**
 * Question:	WAP to reverse the given number. ex -given number 12345 [OUTPUT -54321]
 * Question:	Check the given number is Armstrong or not? ex -153
 * 				(1*1*1)+(5*5*5)+(3*3*3)=153
 */

package QA;

import java.util.Scanner;

public class Q5 {
	public static int reverseNumber(int num) {
		num = num;
		int reverse = 0;
		int reminder = 0;
		while (num > 0) {
			reminder = num % 10;
			reverse = reverse * 10 + reminder;
			num = num / 10;
		}
		System.out.println(reverse);
		return reverse;
	}

	public static int amrstrongNumber(int num) {
		num=num;
		int temp=num;
		int r;
		int aNum=0;
		while(num>0) {
			r=num%10;
			num=num/10;
			aNum=aNum + r*r*r;
		}
		
		if(aNum==temp) {
			System.out.println("Number is armstrong "+aNum);
		}else {
			System.out.println("number is not amrstrong "+aNum);
		}
		return aNum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int value = sc.nextInt();
//		reverseNumber(value);
		amrstrongNumber(value);
		
	}
}
