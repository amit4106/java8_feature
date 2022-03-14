package lambdaFunction;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SortingEmployeeSalary {
	public static void main(String[] args) {
		Set<Employee> s = new TreeSet<>((emp1, emp2) -> (emp1.getEmpName().compareTo(emp2.getEmpName())));
		
		s.add(new Employee(532, "Sachin", 20000));
		s.add(new Employee(533, "Vaisali", 19800));
		s.add(new Employee(534, "Arpit", 23300));
		s.add(new Employee(535, "Digvijay", 16700));
		s.add(new Employee(536, "Preety", 25200));
		
		Iterator<Employee> iterator = s.iterator();
		while (iterator.hasNext()) {
			Employee next = iterator.next();
			System.out.println(next.getEmpId() + " " + next.getEmpName() + " " + next.getSalary());
		}
	}
}
