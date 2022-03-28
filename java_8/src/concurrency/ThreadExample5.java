package concurrency;

public class ThreadExample5 {
public static void main(String[] args) {
	Runnable runnable=()->{
		System.out.println("My thread running");
		System.out.println("Thread Finished");
	};
	Thread thread=new Thread(runnable);
	thread.start();
}
}
