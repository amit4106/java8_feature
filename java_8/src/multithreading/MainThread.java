package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainThread {
public static void main(String[] args) {
	Thread ct = new ChildThread();
	ct.start();
	
	System.out.println("main thread completed");
	ChildThread2 ch = new ChildThread2();
	Thread thread = new Thread(ch, "Amit");
	thread.start();
	
	Callable<String> call=()->{return "callable thread";};
	try {
		
		System.out.println(call.call());
	} catch (Exception e) {
		e.printStackTrace();
	}
	Runnable r=()->System.out.println("I am run");
	Thread t2=new Thread(r);
	t2.start();// It is multithreading
	r.run();// It's not multithreading. here we are call just the method of run method of Runnable (normal method call)
	
	ExecutorService es=Executors.newCachedThreadPool();
	Future<String> submit = es.submit(call);
	try {
		System.out.println(submit.get());
	} catch (InterruptedException e) {
		e.printStackTrace();
	} catch (ExecutionException e) {
		e.printStackTrace();
	}
}
}
