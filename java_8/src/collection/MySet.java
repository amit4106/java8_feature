package collection;

import java.util.HashSet;
import java.util.Set;

public class MySet<E> extends HashSet<Integer>{

	@Override
	public int hashCode() {
		return 10;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (!super.equals(obj))
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		return true;
//	}
	public static void main(String[] args) {
		
		MySet<Integer> st=new MySet<>();
		st.add(10);
		st.add(20);
		st.add(10);
		System.out.println(st);
	}

	
}
