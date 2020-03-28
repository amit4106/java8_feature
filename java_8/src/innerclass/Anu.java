package innerclass;

public class Anu {
	public void slumGirl() {
		int j=50;
		final int k=60;
		class Ambe{
//			Local Inner class or method local inner class
			static final int i=10;// this is compile time constant.
			
			
			public void m2() {
				System.out.println("m2()");
				System.out.println(j);
				System.out.println(k);
			}
		}
		Ambe obj=new Ambe();
		obj.m2();
	}
	public static void main(String[] args) {
		new Anu().slumGirl();
	}
	}

