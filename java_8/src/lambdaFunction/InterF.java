package lambdaFunction;
/**
 * conversion of method to lambda expression:
 * -> public void m1();  							()->{};
 * -> public void m2(int a)							(a)->{};
 * -> public void m3(int rollNo,String name){}		(rollNo, name)->{};
 * -> public int m4(){}								()->{return 10};
 * 
 * @author Dell
 *
 */
@FunctionalInterface
public interface InterF {

	//public void m1();
	public void m2();
	
}
