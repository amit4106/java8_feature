package multithreading;

public class Demo {
	public static void main(String[] args) throws Exception {
		Display d1=new Display();
		DemoThread t1=new DemoThread(d1,"Amit");
		DemoThread t2=new DemoThread(d1,"Kumar");
		t1.start();
		t2.start();
		System.out.println(t2.isDaemon());
	}
}

class DemoThread extends Thread {
	Display d;
	String name;

	public DemoThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

class Display {
	public  void wish(String name) {
		for (int i = 1; i < 5; i++) {
			System.out.println("Good Morning");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			System.out.println(name);
		}
	}
}
