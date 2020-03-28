package Inheritance;

public class Q1 {
	
	static Animal an=new Bird();
	
	//static Animal a=new Animal();
	
	public static void main(String[] args) {
	System.out.println(an instanceof Fly);
	//System.out.println(a instanceof Bird);
	}
	
}

interface Fly{
	
}

class Animal{
	
}

class Bird extends Animal implements Fly{
	
}
