package practics2;

import java.util.ArrayList;
import java.util.List;

public class QA69 {
public static void main(String[] args) {
	List<String> list1=new ArrayList<>();
	list1.add("A");
	list1.add("B");
	List list2=List.copyOf(list1);
	list2.add("C");
	List<List<String>> list3=List.of(list1, list2);
	System.out.println(list3);
}
}
