package practics;

public class QA18 {
	private static Plant plant;
	public static void feed(Plant p) {
		if(p instanceof Tulip) {
			System.out.println("take extra care");
		}
		p=null;
	}
	public static void main(String[] args) {
		plant=new Tulip();
		feed(plant);
		feed(plant);
	}
}

class Plant {
}

class Tulip extends Plant {
}
