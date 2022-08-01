package practics2;

import java.util.List;
import java.util.function.BinaryOperator;

public class QA90 {
public static void main(String[] args) {
	List<Employee5> list=List.of(new Employee5("John", 80000.0), new Employee5("Scott", 90000.0));
	double start=0.0;
	double ratio=1.0;
	BinaryOperator<Double> bo=(a,b)->a+b;
	Double totalSalary = list.stream().map(e->e.getSalary() *ratio).reduce(start, bo);
//	double totalSalary=list.stream().map(e->e.getSalary()*ratio).reduce(null, bo)
	System.out.println(totalSalary);
}
}

class Employee5{
	String name;
	double salary;
	Employee5(String name, double salary){
		this.name=name;
		this.salary=salary;
	}
	public String getName() {return name;}
	public double getSalary() {return salary;}
}
