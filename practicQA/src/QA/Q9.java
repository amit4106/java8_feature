package QA;

/**
 * Singleton class designe pattern
 * 
 * @author dell
 *
 */

public class Q9 {
	public static void main(String[] args) {
		Demo obj1 = Demo.getInstance();
		Demo obj2 = Demo.getInstance();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}

class Demo {
	static Demo obj = new Demo();

	private Demo() {
	}

	public static Demo getInstance() {
		return obj;
	}
}
