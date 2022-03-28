package concurrency;

public class ThreadExample6 {
public static void main(String[] args) {
	Runnable runable=()->{
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName+" running");
	};
	Thread thread=new Thread(runable, "The Thread 1");
	thread.start();
//	Thread thread1=new Thread(runable, "The Thread 2"); 
//	thread1.start();
}
}

/* 
 * Run both Thread() at same time and see the output, here output is coming as per CPU availability. So order of the output is not fixed
 *
 * 
 */