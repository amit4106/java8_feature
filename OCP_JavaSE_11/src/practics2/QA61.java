package practics2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QA61 {
public static void main(String[] args) {
	List<Person> list=new ArrayList<>(List.of(new Person(44, "Tom"),
												new Person(40, "Aman"),
												new Person(40, "Peter")));
	list.sort(Comparator.comparing((Person::getAge)).thenComparing(Person::getName));
	list.forEach(p1->System.out.print(" "+ p1.getName()));
}
}

class Person{
	String name;
	int age;
	Person(int age, String name) {
		this.age=age;this.name=name;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
}


