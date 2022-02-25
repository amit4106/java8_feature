package api;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public void genericMethod(List<String> al) {
		al.add("war");
		al.add("zone");
		al.add(null);
//		al.add(10); error
	}
public static void main(String[] args) {
	Test t=new Test();
	GenericImple<Integer> gi=new GenericImple<>();
	GenericImple<Double> gi1=new GenericImple<>();
//	GenericImple<String> gi2=new GenericImple<>(); //here class can only take the same type parameter or his child type of type Number
	ArrayList<? extends Number> al=new ArrayList<Long>();
}
}
