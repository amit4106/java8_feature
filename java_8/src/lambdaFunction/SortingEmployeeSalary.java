package lambdaFunction;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingEmployeeSalary {
	public static void main(String[] args) {
		List<Employee> l=new ArrayList<>();
		l.add(new Employee(532, "Sachin", 20000));
		l.add(new Employee(533, "Vaisali", 16700));
		l.add(new Employee(534, "Arpit", 23300));
		l.add(new Employee(535, "Digvijay", 16700));
		l.add(new Employee(536, "Preety", 25200));
		
		Comparator<Employee> sort=(e1, e2)->{
		int diff= -(int) -(e1.getSalary() - e2.getSalary());
		if(diff==0) {
			 diff = e1.getEmpName().compareTo(e2.getEmpName());
		}
			return diff;
		};
		l.sort(sort);
		l.forEach(e->System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getSalary()));
	}
}
