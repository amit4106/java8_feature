package JavaBasicTest;

public class Q14 {

	static {
		System.out.println("This Java program run without the main method");
		System.exit(0);
	}
	{
		System.out.println("non static block");
	}

	public static void main(String[] args) {
		Q14 q = new Q14();
	}
}
