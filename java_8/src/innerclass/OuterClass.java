package innerclass;

public class OuterClass {

	public void m1() {
		System.out.println("OuterClass: m1");
	}

	public static class InnerClass {
		public void m2() {
			System.out.println("InnerClass: m2");
		}
	}

	public static void main(String[] args) {
		OuterClass oc=new OuterClass();
		oc.m1();
		//OuterClass.InnerClass 
	}
}
