package lambdaFunction;

public class Test2 {

	public static void main(String[] args) {

//	public int add(int a, int b);
//	InterF2 f2=( a, b)->a+b;
	
//	int result =f2.add(10, 20);
//	System.out.println(result);
	
//	f2.m1();	
//	InterF2.m2(20);

		InterF5 f = (a) -> a;
		int result = f.run(10);
		System.out.println(result);
	}
}
