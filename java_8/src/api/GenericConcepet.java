package api;

import java.util.ArrayList;
import java.util.List;

public class GenericConcepet {
	public static void main(String[] args) {
		ArrayList<Number> al = new ArrayList<>();
		List<Number> al2 = new ArrayList<>();
		MyGeneric<String> mg=new MyGeneric<>();
		mg.add("String type");
		MyGeneric<Number> mg1=new MyGeneric<Number>();
		mg1.add(100.0);
	}
}
