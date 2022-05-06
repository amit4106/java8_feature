package apiGeneric;

import java.util.ArrayList;
import java.util.List;

/**
 * Advantage of generic concept : 1. Type safety 2. Resolve class cast exception
 * Identifying generic : if <>(diamond operator) is there then it is generic.
 * 
 * @author Dell
 *
 */
public class Generic {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<>();
		List<Integer> al3 = new ArrayList<>();
//		List <Number>al4=new ArrayList<Integer>(); // polymorphism concept is applicable to base type only not to parameter type.
		MyGeneric<Integer> mg = new MyGeneric<>();
		mg.add(10);
		MyGeneric<Number> mg1 = new MyGeneric<>();
		mg1.add(50.5);
		MyGeneric<String> mg2 = new MyGeneric<>();
		mg2.add("Yashvani");
		MyGeneric<Long> mg3 = new MyGeneric<>();
		mg3.add(10l);
		MyGeneric<Double> mg4 = new MyGeneric<>();
		ArrayList<String> al4 = new ArrayList<>();
		al4.add("Sneha");
		mg4.add(50.5);

//		mg4.m1(al4);
//		mg4.m1(al);
//		mg4.m1(al2);

//		Test<Number> t=new Test<>();
		Test<Integer> t0 = new Test<>();
//		Test<String> t1=new Test<>(); String not a type of number/boundation.
		Test<Long> t2 = new Test<>();
		Test<Double> t3 = new Test<>();
		Test1<InterF> t5 = new Test1<>();
		Test1<Impl1> t6 = new Test1<>();
		Test1<Impl2> t7 = new Test1<>();
		Test2<String> ti = new Test2<>();

	}
}
