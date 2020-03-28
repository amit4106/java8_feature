package DataTpyes;

public class Q14 {
	
	public static void main(String args[]) {
		A ab=new B();
		System.out.println(ab.x);
	}

}

class A{
	protected int x=10;
	static int j=21;
}

class B extends A{}
