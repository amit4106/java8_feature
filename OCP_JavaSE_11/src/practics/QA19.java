package practics;

import java.util.List;

public class QA19 {
	public static void main(String[] args) {
		var items=List.of(new Item("A", 10),new Item("B", 2), new Item("C", 12),
				new Item("D", 5), new Item("E", 6));
//			if(items.stream().filter(i-> count <0).findFirst()) {
				System.out.println("There is an item for which the variable count is below zero");
//			}
		
	}
}

class Item {
	public String name;
	public int count;

	public Item(String name, int count) {
		this.name = name;
		this.count = count;
	}
}