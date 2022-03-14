package annotation;

import java.util.ArrayList;

public class B extends A{
	
	@Override
	@SuppressWarnings("unchecked")
	public void show() {
		ArrayList<Integer> al=new ArrayList();
		System.out.println("In B");
	}
	
	@Deprecated
	public void m1() {
		
	}
}
