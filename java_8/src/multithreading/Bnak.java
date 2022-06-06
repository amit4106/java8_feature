package multithreading;

public class Bnak {
	public void m1(){System.out.println("m1");}
	public synchronized void m2(){System.out.println("m2");}
	public static synchronized void m3(){System.out.println("m3");}
	public synchronized void m4(){System.out.println("m4");}
	public void m5(){System.out.println("m5");}
	public static synchronized void m6(){System.out.println("m6");}
	public static void m7() {System.out.println("m7");}
	public static void m8() {System.out.println("m8");}
}
