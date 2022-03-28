package concurrency;

public class ThreadExample4 {
	
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("My thread Running");
				System.out.println("Thread Finished");
			}
		};
		Thread thread=new Thread(runnable);
		thread.start();
	}
}
