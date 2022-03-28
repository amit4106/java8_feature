package concurrency;

public class ThreadSleepExample {
	public static void main(String[] args) {
		Runnable runable=()->{
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName+" running");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				}
			System.out.println(threadName+" Finished");
		};
		Thread thread=new Thread(runable, "The Thread");
		thread.start();
	}
}
