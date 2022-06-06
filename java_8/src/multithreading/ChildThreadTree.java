package multithreading;

import java.util.concurrent.Callable;

public class ChildThreadTree implements Callable<String> {

	@Override
	public String call() throws Exception {
		for(int i=0; i<=10;i++) {
			System.out.println(i);
		}
		return "Child-Thread executed";
	}

}
