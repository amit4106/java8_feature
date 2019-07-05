package com.amit.java8.oops;

public class Test {

	public static void main(String[] args) {
		Parent cd=new Parent();
		cd.m1();
				Parent pr=new Child();
				pr.m1();
				Child cd1=new Child();
				cd1.m1();
//D d=new D(); we cannot make obj of those class which is outside of the package without public keyword.
//             -or we cannot import those class.
	}

}
