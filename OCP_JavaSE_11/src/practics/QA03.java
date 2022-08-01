package practics;

public class QA03 extends AbstractCopier implements Copier {
public static void main(String[] args) {
	
}
}

interface Copier{
	public default void print(String msg) {
		System.out.println("msg from copier "+ msg);
	}
}

abstract class AbstractCopier{
//	protected void print(String load) {
//		System.out.println("Message from AbstractCopier "+load);
//	}
}