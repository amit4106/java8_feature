package collection;

import java.util.ArrayList;

public class MyArrayList<E> extends ArrayList<Integer>{
	
	

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	public static void main(String[] args) {
		MyArrayList<Integer> ar=new MyArrayList<>();
		ar.add(10);
		ar.add(20);
		ar.add(10);
		System.out.println(ar);

	}

}
