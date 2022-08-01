package com.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1 {
	public static void main(String[] args) {
//		without spring IOC
		A aObj=new A();
		aObj.setA(20);
		aObj.setName("Amit");
		B bObj=new B(30, "Hello IOC");
		Hello hello=new Hello();
		hello.setaObj(aObj);
		hello.setbObj(bObj);
		hello.show();
		System.out.println("-----------");
//		with spring IOC
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
			Hello bean = ctx.getBean("hello",Hello.class);
			Hello bean1 = ctx.getBean("hello",Hello.class);
			System.out.println(bean.hashCode()+" "+bean1.hashCode());
			bean.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
