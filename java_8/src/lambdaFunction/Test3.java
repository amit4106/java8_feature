package lambdaFunction;

public class Test3 {

	public static void main(String[] args) {

		// public String getFullname(String firstname, String lastName);
		InterF3 f3 = (firstName, lastName) -> firstName + " " + lastName;
		String fullname = f3.getFullname("Vijay", "Prashad");
		System.out.println(fullname);
		
		//public void setName(String name);
		
		InterF4 f4=name->
			System.out.println(name);
				f4.setName("Rajesh");
		
	}

}
