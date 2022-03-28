package concurrency;

public class MyThread extends Thread {
	public void run() {
		System.out.println("My thread running");
		System.out.println("Thread Finished");
	}
public static void main(String[] args) {
	MyThread mThread=new MyThread();
	mThread.start();
}
}
