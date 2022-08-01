package practics2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class QA62 {
public static void main(String[] args) {
	List<Employee> roster=new ArrayList<>(List.of(new Employee("Amit", "Patna"), new Employee("Pratik", "Patna"),
			new Employee("Swati", "Lucknow"), new Employee("Brajesh", "bhopal")));
	Set<String> count = roster.stream().map(Employee::getLocality).distinct().collect(Collectors.toSet());
	System.out.println(count);
}
}

class Employee{
	private String name;
	private String locality;
	public Employee(String name, String locality) {
		super();
		this.name = name;
		this.locality = locality;
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
	 * @return the locality
	 */
	public String getLocality() {
		return locality;
	}
	/**
	 * @param locality the locality to set
	 */
	public void setLocality(String locality) {
		this.locality = locality;
	}
	
}
