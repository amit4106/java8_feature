package QA;

/**
 * How to reverse a String in Java?
 * 
 * @author Amit
 *
 */

public class Q7 {

	public static String reverse(String in) {
		if(in==null)
			throw new IllegalArgumentException("Null is not valid String");
		StringBuilder out=new StringBuilder();
		char[] chars=in.toCharArray();
		for(int i=chars.length-1; i>=0;i--) {
			out.append(chars[i]);
		}
		return out.toString();
	}
	public static void main(String[] args) {
		String str="EDIR-i";
		System.out.println(reverse(str));
	}
}
