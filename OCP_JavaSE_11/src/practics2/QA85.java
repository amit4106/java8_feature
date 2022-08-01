package practics2;

import java.util.Arrays;
import java.util.Comparator;

public class QA85 {
static class Person implements Comparator<Person>{
	private String name;
	public Person(String name) {
	this.name=name;
	}
	@Override
	public int compare(Person o1, Person o2) {
		return o1.name.compareTo(o2.name);
	}
	
	
	
}
public static void main(String[] args) {
	Person[] people= {new Person("Joe"), new Person("Jane"), new Person("John")};
	Arrays.sort(people);
	for(Person person: people) {
		System.out.println(person.name);
	}
}
}
