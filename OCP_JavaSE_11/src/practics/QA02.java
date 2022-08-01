package practics;

public class QA02 {
	public static void main(String[] args) {
		int result=0;
//		Abacus aba = (int e, int f) -> { return e * f; };
		Abacus aba = (a, b) -> a * b;
		result=aba.cal(10,20);
		System.out.println(result);
	}
}

interface Abacus {
	public int cal(int a, int b);
}
