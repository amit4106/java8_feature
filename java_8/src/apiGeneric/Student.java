package apiGeneric;

public class Student {
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//@Override
	//public String toString() {
		//return "["+id + " , " + name + "]";
	//}

	public static void main(String[] args) {
		Student s=new Student(101 , "Amit");
		System.out.println(s);
	}
}