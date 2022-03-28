package concurrency;

import concurrency.ThreadExample2.MyThread;

public class ThreadExample3 {
	public static class MyRunnable implements Runnable {
		@Override
		public void run() {
			System.out.println("My thread Running");
			System.out.println("Thread Finished");
		}
	}

	public static void main(String[] args) {
		Thread thread= new Thread(new MyRunnable());
		thread.start();
	}
}