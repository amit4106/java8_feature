package multithreading;

public class ThreadDemo {
	public static void main(String[] args) {
		System.out.println(new Thread().getName());
		System.out.println(new Thread().getThreadGroup().getName());
		Thread t = new Thread();
		t.setPriority(1);
		System.out.println(t.getPriority());
	}
}
