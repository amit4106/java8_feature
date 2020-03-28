package lambdaFunction;

public class Test4 {

	public static void main(String[] args) {
		
		InterF2 f=(a,b)->a+b;
		int result=f.add(10, 20);
		System.out.println(result);
		f.m1();
		
		InterF2.m2(10);
	}
}
