package Inheritance;

public class Q2 {

	public static void main(String[] args) {

		I i = new I() {
		};
		System.out.println(I.x + i.getValue() + "" + i.toString1());
		System.out.println(I.x +  "" + i.toString1());

	}

}

interface I {
	int x = 10;

	public default int getValue() {
		return 5;
	}
// You can't override object class methods() in interface. Otherwise you'll get compile time error.
	
//	public default String toString() {
//		return "I";
//	}
	public default String toString1() {
		return "I";
	}
}

