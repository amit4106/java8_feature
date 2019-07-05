package com.amit.java.collecton;

public class Employee {
	
	
private String name;
private int salary;


public Employee(String name, int salary) {
	super();
	this.name = name;
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
//@Override
//public int compareTo(Employee emp) {
//	int compareTo = -(this.salary-emp.getSalary());
//	System.out.println("*** "+compareTo);
//	return compareTo;
//		}
@Override
public String toString() {
	return "Employee [name=" + name + ", salary=" + salary + "]";
}


}
