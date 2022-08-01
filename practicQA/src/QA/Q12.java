package QA;

import java.util.Scanner;

/**
 * Java Program to check if a vowel is present in the string?
 * 
 * @author dell
 *
 */

public class Q12 {
	
	public static boolean stringContainsVowels() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		return str.toLowerCase().matches(".*[aeiou].*");
	}
	public static void main(String[] args) {
		System.out.println(stringContainsVowels());
	}

}
