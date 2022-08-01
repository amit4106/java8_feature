package QA;

/**
 * How to swap two numbers without using a third variable? 
 * int a = 10; and int b = 20;
 * 
 * @author dell
 *
 */

public class Q8 {
	public static void main(String[] args) {
		int a=10;
		int b=50;
		b=b+a;
		a=b-a;
		b=b-a;
		System.out.println(a+":"+b);
		
	}
}
