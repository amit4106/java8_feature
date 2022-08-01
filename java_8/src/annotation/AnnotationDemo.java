package annotation;

public class AnnotationDemo {
	public static void main(String[] args) {
		A obj=new A();
		B obj2=new B();
		A obj3=new B();
		obj.show();
		obj2.show();
		obj3.show();
		
		obj2.m1(); // here we have used @Deprecated annotation means we cannot use this method m1().
	}
}
