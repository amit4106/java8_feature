package Inheritance;

public class Q4 {

	public static void main(String[] args) {
System.out.println(B.print());
	}

}

interface A{
	
	public static void print() {
		System.out.println("A");
	}
}

 interface B extends A{
	static String print() {
		return "C";
	}
}
