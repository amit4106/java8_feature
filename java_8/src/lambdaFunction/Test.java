package lambdaFunction;

public class Test {
	
	public static void m1() {

		InterF f=()->{
			System.out.println("Hello lambda -1");
			
		};
	f.m2();
	}
	public static void m2() {

		InterF f=()->
			System.out.println("Hello lambda -2");
			
			f.m2();
	}
	
	public static void main(String[] args) {

		m1();
		m2();
	}

}
