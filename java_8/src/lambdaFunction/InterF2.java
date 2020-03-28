package lambdaFunction;

public interface InterF2 {

	public int add(int a, int b);

	public default void m1() {
		System.out.println("this is from default method");
	}
	
	public static int m2(int a) {
		System.out.println("hello from static method");
		return 10;
	}
}
