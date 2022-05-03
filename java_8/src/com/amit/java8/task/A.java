package com.amit.java8.task;

interface A extends B {

}

@FunctionalInterface
interface B {
	<T> void m1(T t);
}


interface C extends A, B {
	<T> void m2(T t);
}
