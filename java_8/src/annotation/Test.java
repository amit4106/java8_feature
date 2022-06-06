package annotation;

import java.lang.reflect.Method;

public class Test {
	@MyAnnotation
	public void m1() {
	System.out.println("m()");	
	}
	@MyAnnotation(developer="Jack", developeDate = "02/02/2018")
	public void m2() {
		System.out.println("m2()");
	}
public static void main(String[] args) {

	try {
		Method method = new Test().getClass().getMethod("m2");
		MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
		System.out.println(annotation.developer()+" "+annotation.developeDate());
	} catch (NoSuchMethodException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
//	MyAnnotation annotation = methods[0].getAnnotation(MyAnnotation.class);
//	
}
}
