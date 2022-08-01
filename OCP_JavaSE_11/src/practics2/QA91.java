package practics2;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class QA91 {
public static void main(String[] args) {
	List<Employee6> roster=new ArrayList<>();
	Predicate<Employee6> y=(Employee6 e)->e.getBirthdady().isBefore(IsoChronology.INSTANCE.date(1989,1,1));
//	Set<String> s1=roster.stream().collect(Collectors.partitioningBy(y))
//			.get(true)
//			.map
			
//	System.out.println(s1);
}
}

class Employee6{
	private String name;
	private LocalDate birthdady;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getBirthdady() {
		return birthdady;
	}
	
	public void setBirthdady(LocalDate birthdady) {
		this.birthdady = birthdady;
	}
	public Employee6(String name, LocalDate birthdady) {
		super();
		this.name = name;
		this.birthdady = birthdady;
	}
}
