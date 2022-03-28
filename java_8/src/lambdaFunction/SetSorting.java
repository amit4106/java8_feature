package lambdaFunction;

import java.util.HashSet;
import java.util.Set;

public class SetSorting {

	public static void main(String[] args) {
		Set<Employee> set=new HashSet<>();
		set.add(new Employee(101, "Amit", 20000));
		set.add(new Employee(102, "Ankush", 30000));
		set.add(new Employee(103, "Anamika", 20000));
		set.add(new Employee(104, "Aditya", 40000));
		set.add(new Employee(105, "Himani", 40000));
		set.add(new Employee(102, "Ankush", 30000));
		set.forEach(e->System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getSalary()));
	}

}
