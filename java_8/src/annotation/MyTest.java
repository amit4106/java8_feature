package annotation;

import java.util.Iterator;

public class MyTest {
	public static void main(String[] args) {
		try {
			Class<?> forName = Class.forName("annotation.Test");
			System.out.println(forName);
			try {
				annotation.Test test=(annotation.Test)forName.newInstance();
				test.m1();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
